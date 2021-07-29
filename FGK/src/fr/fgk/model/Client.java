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
public class Client {

    private int idClient;
    private String nom;

    private int idPlatDisp;
    private String platDispos;
    private float prixPlatDispos;
    
    private int idPlatsChoisis;
    private String platChoisi;
    private int qtePlatChoisi;
    
    private int idCategorie;
    private String categoriePlat;
    
    private String facture;
    private float montantFacture;
    private String dateFacturation;
    private int etatCommande;

    public Client() {
    }

    public Client(int idClient, String nom, int idPlatDisp, String platDispos, float prixPlatDispos, int idPlatsChoisis, String platChoisi, int qtePlatChoisi, String categoriePlat, String facture, float montantFacture, String dateFacturation, int etatCommande) {
        this.idClient = idClient;
        this.nom = nom;
        this.idPlatDisp = idPlatDisp;
        this.platDispos = platDispos;
        this.prixPlatDispos = prixPlatDispos;
        this.idPlatsChoisis = idPlatsChoisis;
        this.platChoisi = platChoisi;
        this.qtePlatChoisi = qtePlatChoisi;
        this.categoriePlat = categoriePlat;
        this.facture = facture;
        this.montantFacture = montantFacture;
        this.dateFacturation = dateFacturation;
        this.etatCommande = etatCommande;
    }

    public Client(String nom) {
        this.nom = nom;
    }

    public Client(int idClient, String nom, int idPlatDisp, String platDispos, float prixPlatDispos, int idPlatsChoisis, String platChoisi, int qtePlatChoisi, int idCategorie, String categoriePlat, String facture, float montantFacture, String dateFacturation, int etatCommande) {
        this.idClient = idClient;
        this.nom = nom;
        this.idPlatDisp = idPlatDisp;
        this.platDispos = platDispos;
        this.prixPlatDispos = prixPlatDispos;
        this.idPlatsChoisis = idPlatsChoisis;
        this.platChoisi = platChoisi;
        this.qtePlatChoisi = qtePlatChoisi;
        this.idCategorie = idCategorie;
        this.categoriePlat = categoriePlat;
        this.facture = facture;
        this.montantFacture = montantFacture;
        this.dateFacturation = dateFacturation;
        this.etatCommande = etatCommande;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
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

    public int getIdPlatsChoisis() {
        return idPlatsChoisis;
    }

    public void setIdPlatsChoisis(int idPlatsChoisis) {
        this.idPlatsChoisis = idPlatsChoisis;
    }

    public String getPlatChoisi() {
        return platChoisi;
    }

    public void setPlatChoisi(String platChoisi) {
        this.platChoisi = platChoisi;
    }

    public int getQtePlatChoisi() {
        return qtePlatChoisi;
    }

    public void setQtePlatChoisi(int qtePlatChoisi) {
        this.qtePlatChoisi = qtePlatChoisi;
    }

    public String getCategoriePlat() {
        return categoriePlat;
    }

    public void setCategoriePlat(String categoriePlat) {
        this.categoriePlat = categoriePlat;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
