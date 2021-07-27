/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.fgk.model;

/**
 *
 * @author Nathan Ghozlan
 */

public class PlatsChoisis {
    
    private int idPlatsChoisis;
    private int qte;
    private Plats idPlats;

    public PlatsChoisis() {
    }

    public PlatsChoisis(int idPlatsChoisis, int qte, Plats idPlats) {
        this.idPlatsChoisis = idPlatsChoisis;
        this.qte = qte;
        this.idPlats = idPlats;
    }

    public int getIdPlatsChoisis() {
        return idPlatsChoisis;
    }

    public void setIdPlatsChoisis(int idPlatsChoisis) {
        this.idPlatsChoisis = idPlatsChoisis;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Plats getIdPlats() {
        return idPlats;
    }

    public void setIdPlats(Plats idPlats) {
        this.idPlats = idPlats;
    }
    
    
    
    
    
    
    
    
}
