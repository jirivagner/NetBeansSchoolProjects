/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kalkulator;

/**
 *
 * @author J
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulacka kalkulacka = new Kalkulacka();
        try{
            double vysledek = kalkulacka.vydel(6, 0);
            System.out.println(vysledek);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally{
    }
    }
}
    

