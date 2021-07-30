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
public class Categorie {
    
    private int idCategorie;
    private String categoriePlat;

    public Categorie() {
    }

    public Categorie(int idCategorie, String categoriePlat) {
        this.idCategorie = idCategorie;
        this.categoriePlat = categoriePlat;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getCategoriePlat() {
        return categoriePlat;
    }

    public void setCategoriePlat(String categoriePlat) {
        this.categoriePlat = categoriePlat;
    }
    
    
    
    
}
