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

import fr.fgk.model.Categorie;

public class Plats {
    private int idPlat;
    private String libelle;
    private float prixPlat;
    private Categorie idCat;

    public Plats() {
    }

    public Plats(int idPlat, String libelle, float prixPlat, Categorie idCat) {
        this.idPlat = idPlat;
        this.libelle = libelle;
        this.prixPlat = prixPlat;
        this.idCat = idCat;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(int idPlat) {
        this.idPlat = idPlat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrixPlat() {
        return prixPlat;
    }

    public void setPrixPlat(float prixPlat) {
        this.prixPlat = prixPlat;
    }

    public Categorie getIdCat() {
        return idCat;
    }

    public void setIdCat(Categorie idCat) {
        this.idCat = idCat;
    }
    
    
    
    
    
}
