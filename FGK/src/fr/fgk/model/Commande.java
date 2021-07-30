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
public class Commande {
    
    private int idPlatChoisis;
    private int idClient;

    public Commande() {
    }

    public Commande(int idPlatChoisis, int idClient) {
        this.idPlatChoisis = idPlatChoisis;
        this.idClient = idClient;
    }

    public int getIdPlatChoisis() {
        return idPlatChoisis;
    }

    public void setIdPlatChoisis(int idPlatChoisis) {
        this.idPlatChoisis = idPlatChoisis;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    
    
    

}
