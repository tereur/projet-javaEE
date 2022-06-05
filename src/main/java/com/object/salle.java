package com.object;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.bdd.bdd;

public class salle {
private String nom;
private int capacite;
public salle(String nom,int capacite) {
	this.nom=nom;
    this.capacite=capacite;
	
}

public salle() {
	// TODO Auto-generated constructor stub
}
public int getCapacite() {
	return capacite;
}
public void setCapacite(int capacite) {
	this.capacite = capacite;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public void sauve() {
	bdd BDD =new bdd();
	
	
		try {
			PreparedStatement statement;
			statement = BDD.getConnexion().prepareStatement("INSERT INTO salle(nom,capacite)VALUES(?,?)");
		
			
         statement.setString(1, this.getNom().toUpperCase());
         statement.setLong(2, this.getCapacite());
        
         statement.executeUpdate();
      
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}finally {
        // Fermeture de la connexion
        try {
            if (BDD.getConnexion()!= null)
            	BDD.getConnexion().close();
        } catch (SQLException ignore) {
        }}
}
public List<salle> All() {
    List<salle> salles = new ArrayList<salle>();
    Statement statement = null;
    ResultSet resultat = null;
	bdd BDD =new bdd();
    
    try {
        statement =BDD.getConnexion().createStatement();

        // Exécution de la requête
        resultat = statement.executeQuery("SELECT *FROM salle;");

        // Récupération des données
        while (resultat.next()) {
            String nom = resultat.getString("nom");
            int capacite =Integer.parseInt( resultat.getString("capacite"));
            
            salle salle = new salle(nom,capacite);
            
            salles.add(salle);
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
    
    return salles;
}
}
