/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.dao;

import fr.fgk.model.Client;
import fr.fgk.model.Plat;
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
public class PlatDao {
    
    public static List<Plat> getAllPlatsDisp() throws SQLException {
        List<Plat> platDisp = new ArrayList<>();
        String sql = "SELECT * FROM plat";
        Connection connexion = AccessBd.getConnection();

        Statement requete = connexion.createStatement();
        ResultSet rs = requete.executeQuery(sql);

        while (rs.next()) {

            Plat p = new Plat();
            p.setIdPlatDisp(rs.getInt("idPlat"));
            p.setPlatDispos(rs.getString("libelle"));
            p.setPrixPlatDispos(rs.getFloat("prixPlat"));
            p.setIdCat(rs.getInt("idCat"));
            platDisp.add(p);
        }

        return platDisp;

    }
    
    public static Plat getPlatById(int id) throws SQLException {
        Plat u = null;
        String sql = "SELECT * FROM `plat` WHERE idPlat=?";
        Connection connexion = AccessBd.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, id);

        ResultSet rs = prepare.executeQuery();

        if (rs.next()) {
            u = new Plat();
            u.setIdPlatDisp(rs.getInt("idPlat"));
            u.setPlatDispos(rs.getString("libelle"));
            u.setPrixPlatDispos(rs.getFloat("prixPlat"));
            u.setIdCat(rs.getInt("idCat"));
        }

        return u;

    }
    
}
