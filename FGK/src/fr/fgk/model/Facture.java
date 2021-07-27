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
    
    private int idFact;
    private float montant;
    private String dateFacturation;
    private int etat;
    private Client idCli;

    public Facture() {
    }

    public Facture(int idFact, float montant, String dateFacturation, int etat, Client idCli) {
        this.idFact = idFact;
        this.montant = montant;
        this.dateFacturation = dateFacturation;
        this.etat = etat;
        this.idCli = idCli;
    }

    public int getIdFact() {
        return idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDateFacturation() {
        return dateFacturation;
    }

    public void setDateFacturation(String dateFacturation) {
        this.dateFacturation = dateFacturation;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Client getIdCli() {
        return idCli;
    }

    public void setIdCli(Client idCli) {
        this.idCli = idCli;
    }
    
    
    
}
