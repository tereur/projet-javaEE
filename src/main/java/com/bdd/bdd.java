package com.bdd;

import java.sql.*;



public class bdd {
	private 	Connection connexion ;
	
    public  bdd(){
    	
    	 try {
             // charge la classe de driver
              Class.forName( "org.postgresql.Driver" );
             
          } catch ( ClassNotFoundException e ) {
            
                       e.getMessage() ;
          }
    	 try {
       		 String url = "jdbc:postgresql://localhost:5444/zolacdo";
                String utilisateur = "enterprisedb";
                String motDePasse = "zolacdo001";
                setConnexion(DriverManager.getConnection(  url,utilisateur, motDePasse));
               
       	 } catch ( SQLException e ) {
                
       		e.printStackTrace();
                
                
    }
			
    }

	public Connection getConnexion() {
		return connexion;
	}

	public void setConnexion(Connection connexion) {
		this.connexion = connexion;
	}
   
}
