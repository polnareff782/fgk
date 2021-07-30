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
public class Plat {
    
    private int idPlatDisp;
    private String platDispos;
    private float prixPlatDispos;
    private int idCat;

    public Plat() {
    }

    public Plat(int idPlatDisp, String platDispos, float prixPlatDispos, int idCat) {
        this.idPlatDisp = idPlatDisp;
        this.platDispos = platDispos;
        this.prixPlatDispos = prixPlatDispos;
        this.idCat = idCat;
    }

    
    public int getIdPlatDisp() {
        return idPlatDisp;
    }

    public void setIdPlatDisp(int idPlatDisp) {
        this.idPlatDisp = idPlatDisp;
    }

    public String getPlatDispos() {
        return platDispos;
    }

    public void setPlatDispos(String platDispos) {
        this.platDispos = platDispos;
    }

    public float getPrixPlatDispos() {
        return prixPlatDispos;
    }

    public void setPrixPlatDispos(float prixPlatDispos) {
        this.prixPlatDispos = prixPlatDispos;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    
    
    
    
}
