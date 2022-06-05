package com.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bdd.bdd;

public class Eva {
	private String faceva;
private String nomeva;
private int dureeva;
private String heurefinEva;
private String heuredebEva;
private String sessionEva;
private int nbs;
private String[] salle;
private String[] uv;
private int nbf;
	public Eva() {
		// TODO Auto-generated constructor stub
		faceva=null;
		nomeva=null;
		dureeva=0;
		heurefinEva="00-00";
		heuredebEva="00-00";
		sessionEva=null;
		nbs=0;
		nbf=0;
	}
	public Eva(String examen , String[] uv ) {
		this.sessionEva=examen;
		this.uv=uv;
		
	}
	public int getDureeva() {
		return dureeva;
	}
	public void setDureeva(int dureeva) {
		this.dureeva = dureeva;
	}
	public String getNomeva() {
		return nomeva;
	}
	public void setNomeva(String nomeva) {
		this.nomeva = nomeva;
	}
	public String getHeurefinEva() {
		return heurefinEva;
	}
	public void setHeurefinEva(String heurefinEva) {
		this.heurefinEva = heurefinEva;
	}
	public String getHeuredebEva() {
		return heuredebEva;
	}
	public void setHeuredebEva(String heuredebEva) {
		this.heuredebEva = heuredebEva;
	}
	public String getSessionEva() {
		return sessionEva;
	}
	public void setSessionEva(String sessionEva) {
		this.sessionEva = sessionEva;
	}
	public int getNbs() {
		return nbs;
	}
	public void setNbs(int nbs) {
		this.nbs = nbs;
	}
	public String[] getSalle() {
		return salle;
	}
	public void setSalle(String[] salle) {
		this.salle = salle;
	}
	public String[] getUv() {
		return uv;
	}
	public void setUv(String[] uv) {
		this.uv = uv;
	}
	public int getNbf() {
		return nbf;
	}
	public void setNbf(int nbf) {
		this.nbf = nbf;
	}
	public String getFaceva() {
		return faceva;
	}
	public void setFaceva(String faceva) {
		this.faceva = faceva;
	}
	  
	public String repartition() {
       String affiche="<table class=table><caption align='center'>liste des repartions effectuer cliquer pour sauvegarder</caption>"
       		+ " <thead> <tr> <th>Filiere</th>"
       		+ " <th >Salle</th>"
       		+ " <th >Etudiants</th></tr>"
       		+ " </thead>"
       		+ " <tbody>";
       int len=this.getSalle().length;
       String[] liste=new String[len];
       liste=partage(this.getSalle(),this.getUv());
       for(int i=0; i<this.getUv().length; i++) {
    	affiche=affiche+"<tr><th rowspan="+len+">"+this.uv[i]+"</th>"; 
    	   for(int j=0; j<len; j++) {
    		   affiche=affiche+"<td ><b>Amphi</b> "+this.salle[j]+"</td><td>"+ liste[j]+"</td></tr>";
    	   }
    	  
       }
       
       affiche=affiche+"</tbody>"
       		+ "</table>";
      
		return affiche;
	}
	public int etu_nbr(String uvs) {
		bdd BDD=new bdd();
		 Statement statement = null;
		    ResultSet resultat = null;
		    int nombre=-1;
		    try {
		        statement =BDD.getConnexion().createStatement();
              
		        // Exécution de la requête
		        resultat = statement.executeQuery("SELECT COUNT (*) AS total FROM etudiant_uv WHERE fk_uv='"+ uvs+"';");
                
		        // Récupération des données
		        while (resultat.next()) {
		           nombre=resultat.getInt("total");
		        }
		        
               
		    } catch (SQLException e) {
		    } finally {
		        // Fermeture de la connexion
		        try {
		            if (resultat != null)
		                resultat.close();
		            if (statement != null)
		                statement.close();
		            if (BDD.getConnexion()!= null)
		            	BDD.getConnexion().close();
		        } catch (SQLException ignore) {
		        }
		    }
		
		return nombre;
	}

	 public String[] partage(String salle[],String uv[]) {
		 int[] nombre=new int[salle.length];
		 String[] listetd=new String[salle.length];
		 int  place=0;
		 int premier=0;
		 for(int i=0; i<salle.length; i++)
			  place=place+place(salle[i]);
		 int etud_nbr=0;
		 for(int i=0; i<uv.length; i++)
		  etud_nbr=etud_nbr+etu_nbr(uv[i]);
		
		 if(uv.length==1) {
			place=(int)(place*2)/3 ;
		
			 for(int i=0; i<salle.length; i++) {
				 
					 nombre[i]=(int) (etud_nbr*(place(salle[i])*2)/3)/place;
				     listetd[i]=liste(nombre[i],premier,uv[i]);
				     premier=nombre[i];
			 }
			 
		 }
		return listetd;
		 
	 }
	 
	 public int place(String salle) {
				bdd BDD=new bdd();
				 Statement statement = null;
				    ResultSet resultat = null;
				    int nombre=-1;
				    try {
				        statement =BDD.getConnexion().createStatement();
		     
				        // Exécution de la requête
				        resultat = statement.executeQuery("SELECT capacite AS total FROM salle WHERE nom='"+ salle+"';");
		                
				        // Récupération des données
				        while (resultat.next()) {
				           nombre=resultat.getInt("total");
				        }
		              
		               
				    } catch (SQLException e) {
				    } finally {
				        // Fermeture de la connexion
				        try {
				            if (resultat != null)
				                resultat.close();
				            if (statement != null)
				                statement.close();
				            if (BDD.getConnexion()!= null)
				            	BDD.getConnexion().close();
				        } catch (SQLException ignore) {
				        }
				    }
				
				return nombre;
			}		 
	
	 
	 public String liste(int dernier, int premier , String code) {
		 bdd BDD=new bdd();
		 Statement statement = null;
		    ResultSet resultat = null;
		    ResultSet resultat1 = null;
		    String nombre=null;
		    try {
		        statement =BDD.getConnexion().createStatement();
     
		        // Exécution de la requête
		        resultat = statement.executeQuery("select nometd,prenometd from etudiant  Where id=(select fk_etudiant from (select fk_etudiant from etudiant_uv where fk_uv='"+code+"')limit"+premier+" offset 14 );");
                
		        // Récupération des données
		        while (resultat.next()) {
		           nombre=resultat.getString("nometd")+resultat.getString("prenometd");
		        }
               resultat1 = statement.executeQuery("select nometd,prenometd from etudiant  Where id=(select fk_etudiant from (select fk_etudiant from etudiant_uv where fk_uv='"+code+"')limit"+dernier+" offset 14 );");
                
		        // Récupération des données
		        while (resultat.next()) {
		           nombre=nombre+"a"+resultat1.getString("nometd")+resultat1.getString("prenometd") ;
		        }
              
               
		    } catch (SQLException e) {
		    } finally {
		        // Fermeture de la connexion
		        try {
		            if (resultat != null)
		                resultat.close();
		            if (resultat1!= null)
		                resultat1.close();
		            if (statement != null)
		                statement.close();
		            if (BDD.getConnexion()!= null)
		            	BDD.getConnexion().close();
		        } catch (SQLException ignore) {
		        }
		    }
		 return nombre;
	 }
}
