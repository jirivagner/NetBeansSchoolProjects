/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lide1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J
 */
public class Lide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Clovek karel = new Clovek("Karel Jaromír Erben",22);
        Clovek josef = new Clovek("Josef Novák", 30);
        Clovek petr = new Clovek("Petr Kalina", 82);
        Clovek honza = new Programator("Honza Bůžek", 22, "PHP");
        Programator fanda = new Programator("František Kovačík", 35, "Java");
        Pracujici pracujici = new Programator("Petr Málek", 40, "C++");
        
        karel.pozdrav("Dobrý den");
        josef.pozdrav();
        petr.pozdrav("Nazdáreeeek");
        fanda.pozdrav("Nazdar");
        honza.pozdrav("Heej");
        Clovek.pridejCloveka();
        
        
        
        System.out.println(Clovek.getPocetLidi());
        

                List<Clovek> lide = new ArrayList<>();
                
                lide.add(karel);
                System.out.println(lide.get(0));
                
        System.out.println(Clovek.PLNOLETOST);
        System.out.println(karel.vek);
        
        int a = 56;

        Clovek Karel;
        karel = new Clovek("Karel Vorel", 19);
        
        System.out.println(karel);
        karel = null;
                System.out.println(karel);
       
        
       
        
    }
    
}
