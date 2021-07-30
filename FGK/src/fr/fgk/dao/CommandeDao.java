/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.dao;

import fr.fgk.ihm.CommandeIhm;
import fr.fgk.model.Client;
import fr.fgk.model.Commande;
import fr.fgk.model.PlatChoisis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nathan Ghozlan
 */
public class CommandeDao {

    public static void insertCommande(PlatChoisis choix, Client u) throws SQLException {

        String sql2 = "INSERT INTO commande (idPlatsChoisis, idClient) VALUES (?, ?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql2);
        prepare.setInt(1, choix.getIdPlatsChoisis());
        prepare.setInt(2, u.getIdClient());

        prepare.execute();

    }

    public static void insertCommande2(Commande c) throws SQLException {

        String sql2 = "INSERT INTO commande (idPlatsChoisis, idClient) VALUES (?, ?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql2);
        
        prepare.setInt(1, c.getIdPlatChoisis());
        prepare.setInt(2, c.getIdClient());
        

        prepare.execute();

    }

}
