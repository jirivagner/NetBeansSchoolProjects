/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.nakladak;

/**
 *
 * @author J
 */
public class Nakladak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Naklad naklad = new Naklad();
        naklad.nakladka(1);
        naklad.nakladka(3);
        naklad.vykladka(7);
      naklad.vypis();
    }
    
}
