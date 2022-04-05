/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lide1;
interface Pracujici{
    void pracuj();
}
/**
 *
 * @author J
 */
public class Clovek {
    private static int pocetLidi = 0;
    public static void pridejCloveka(){
        pocetLidi++;
    }
    public static int getPocetLidi(){
        return pocetLidi;
    }
    
    
    
     protected String jmeno;
     protected int vek;
     
     public static final int PLNOLETOST = 18;
     
     public Clovek(){
     }
    
    public Clovek(String jmeno, int vek){
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    public String getJmeno(){
        return jmeno;
    }
    public int getVek(){
        return vek;
    }

 public void pozdrav(String pozdrav){
     
     System.out.printf(" %s, já jsem %s a je mi %d let.\n", pozdrav, jmeno, vek);
     
 }
 
 public void pozdrav(){
     System.out.printf("Ahoj všem od %s s věkem %d let.\n", jmeno, vek);
 }
 
 @Override
 public String toString(){
     return jmeno + "," + vek;
 }
 
}
