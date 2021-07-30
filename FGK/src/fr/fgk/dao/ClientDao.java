/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.dao;

import fr.fgk.ihm.CommandeIhm;
import fr.fgk.model.Client;
import fr.fgk.model.Plat;
import fr.fgk.model.PlatChoisis;
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
    
    public static Client getLastClientById() throws SQLException {
        Client u = null;
        String sql = "SELECT * FROM `client` WHERE idClient=(SELECT max(idClient) FROM client)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new Client();
            u.setIdClient(rs.getInt("idClient"));
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
    
    

}
