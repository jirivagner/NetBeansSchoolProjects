/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.behani;

/**
 *
 * @author J
 */
public class Clovek {
    private String jmeno;
    private int vek;
    private int unava;
    
    public String toString(){
        return String.format("%s (%d)", jmeno, vek );
    }
    
    public Clovek (String jmeno, int vek){
    this.jmeno = jmeno;
    this.vek = vek;
    this.unava = 0;
}
    
    public void bezet (int km){
        if (this.unava + km > 20){
            System.out.println("Jsem příliš unavený");
        } else {
            unava += km;
        }        
    }
    
    public void spat (int hod){
        unava = unava<hod*10? 0 : unava - hod*10;
    }
}


