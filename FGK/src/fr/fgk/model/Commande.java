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
    private PlatsChoisis idPlatsChoisis;
    private Client idClient;

    public Commande() {
    }

    public Commande(PlatsChoisis idPlatsChoisis, Client idClient) {
        this.idPlatsChoisis = idPlatsChoisis;
        this.idClient = idClient;
    }

    public PlatsChoisis getIdPlatsChoisis() {
        return idPlatsChoisis;
    }

    public void setIdPlatsChoisis(PlatsChoisis idPlatsChoisis) {
        this.idPlatsChoisis = idPlatsChoisis;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }
    
    
    
}
