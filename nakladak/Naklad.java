/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nakladak;

/**
 *
 * @author J
 */
public class Naklad {
    
    public int mnozstvi = 0;

    
    public void nakladka (int nakladka){
        if (mnozstvi + nakladka > 15){
        System.out.println("Nenakládat, bude přetížené auto");
    } else
        this.mnozstvi += nakladka;
                      
    }
    
    public void vykladka(int vykladka){
        if (mnozstvi - vykladka < 0){
            System.out.println("Nelze vyložit více, než je na korbě");
        }
          else  
            this.mnozstvi -= vykladka;}

   
    public void vypis() {
        System.out.printf("naklad je %d",mnozstvi);
    }
}
