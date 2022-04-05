/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.auta;

/**
 *
 * @author J
 */
public class Auta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Garaz garaz = new Garaz();
        Auto auto = new Auto("123ABC", "modrá");
        garaz.zaparkuj(auto);
        
        System.out.println(garaz.vypis());
        
    }
    
}
