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
public class PlatChoisis {
    
    private int idPlatsChoisis;
    private int qtePlatChoisi;
    private int idPlat;

    public PlatChoisis() {
    }

    

    public int getIdPlatsChoisis() {
        return idPlatsChoisis;
    }

    public void setIdPlatsChoisis(int idPlatsChoisis) {
        this.idPlatsChoisis = idPlatsChoisis;
    }


    public int getQtePlatChoisi() {
        return qtePlatChoisi;
    }

    public void setQtePlatChoisi(int qtePlatChoisi) {
        this.qtePlatChoisi = qtePlatChoisi;
    }

    public PlatChoisis(int idPlatsChoisis, int qtePlatChoisi, int idPlat) {
        this.idPlatsChoisis = idPlatsChoisis;
        this.qtePlatChoisi = qtePlatChoisi;
        this.idPlat = idPlat;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(int idPlat) {
        this.idPlat = idPlat;
    }

   
    
    
    
    
    
    
    
}
