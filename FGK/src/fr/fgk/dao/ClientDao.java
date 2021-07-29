/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.dao;

import fr.fgk.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan Ghozlan
 */
public class ClientDao {

    public static Client getByNom(String nom) throws SQLException {
        Client u = null;
        String sql = "SELECT * FROM `client` WHERE nom=?";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, nom);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new Client();
            u.setNom(rs.getString("nom"));
        }

        return u;

    }

    public static void insertClient(Client u) throws SQLException {
        String sql = "INSERT INTO client (nom) VALUES (?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.execute();

    }

    public static void insertPlatsChoisis(Client u) throws SQLException {
        
        String sql = "INSERT INTO platschoisis (quantite, idPlat) VALUES (?, ?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, u.getQtePlatChoisi());
        prepare.setInt(2, u.getIdPlatDisp());

        prepare.execute();
        
    }      

    
    public static void insertCommande(Client u) throws SQLException {        
        
        String sql2 = "INSERT INTO commande (idPlatsChoisis, idClient) VALUES (?, ?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql2);
        prepare.setInt(1, u.getIdPlatsChoisis());
        prepare.setInt(2, u.getIdClient());

        prepare.execute();

    }

    public static List<Client> getAllClient() throws SQLException {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM client";
        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();
        ResultSet rs = requete.executeQuery(sql);

        while (rs.next()) {

            Client u = new Client();
            u.setIdClient(rs.getInt("idClient"));
            u.setNom(rs.getString("nom"));
            clients.add(u);
        }

        return clients;

    }
    
    public static List<Client> getAllPlatsDisp() throws SQLException {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM plat";
        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();
        ResultSet rs = requete.executeQuery(sql);

        while (rs.next()) {

            Client u = new Client();
            u.setIdPlatDisp(rs.getInt("idPlat"));
            u.setPlatDispos(rs.getString("libelle"));
            u.setPrixPlatDispos(rs.getFloat("prixPlat"));
            u.setIdCategorie(rs.getInt("idCat"));
            clients.add(u);
        }

        return clients;

    }

}
