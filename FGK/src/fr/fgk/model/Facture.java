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
public class Facture {
    
    private String facture;
    private float montantFacture;
    private String dateFacturation;
    private int etatCommande;
    private int idClient;

    public Facture() {
    }

    public Facture(String facture, float montantFacture, String dateFacturation, int etatCommande, int idClient) {
        this.facture = facture;
        this.montantFacture = montantFacture;
        this.dateFacturation = dateFacturation;
        this.etatCommande = etatCommande;
        this.idClient = idClient;
    }

    

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }

    public float getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(float montantFacture) {
        this.montantFacture = montantFacture;
    }

    public String getDateFacturation() {
        return dateFacturation;
    }

    public void setDateFacturation(String dateFacturation) {
        this.dateFacturation = dateFacturation;
    }

    public int getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(int etatCommande) {
        this.etatCommande = etatCommande;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
    

    
    
    
    
}
