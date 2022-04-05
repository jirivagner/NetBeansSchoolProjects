/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prochazeni;
/**
 *
 * @author J
 */
public class Lokace {
    public String nazev;
    public String popis;
    public Lokace sever;
    public Lokace jih;
    public Lokace zapad;
    public Lokace vychod;
    
   public Lokace(String nazev, String popis){
       this.nazev = nazev;
       this.popis = popis;   
   }
   
         public void vypispozici(){
     System.out.println(nazev);
     System.out.println(popis);
     System.out.println();
     
     String smery = "";
     if(sever!= null){
         smery += " sever"; 
     }
          if(jih!= null){
         smery += " jih"; 
     }
           if(zapad!= null){
         smery += " západ"; 
     }
          if(vychod!= null){
         smery += " východ"; 
     }
     System.out.println("Můžeš jít na" + smery);
          
  }
}
