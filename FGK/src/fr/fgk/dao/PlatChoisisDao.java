/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.dao;

import fr.fgk.model.Plat;
import fr.fgk.model.PlatChoisis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nathan Ghozlan
 */
public class PlatChoisisDao {
    
    public static void insertPlatsChoisis(PlatChoisis choix) throws SQLException {
        
        String sql = "INSERT INTO platschoisis (quantite, idPlat) VALUES (?, ?)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, choix.getQtePlatChoisi());
        prepare.setInt(2, choix.getIdPlat());
        
        prepare.execute();
        
    }
    
    
    public static PlatChoisis getLastPlatChoisisById() throws SQLException {
        PlatChoisis u = null;
        String sql = "SELECT * FROM `platschoisis` WHERE idPlatsChoisis=(SELECT max(idPlatsChoisis) FROM platschoisis)";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new PlatChoisis();
            u.setIdPlatsChoisis(rs.getInt("idPlatsChoisis"));
            u.setQtePlatChoisi(rs.getInt("quantite"));
            u.setIdPlat(rs.getInt("idPlat"));
        }

        return u;

    }
    
}
