/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auta;

/**
 *
 * @author J
 */
public class Auto {
    
   public String spz;
   public String barva;
       public Auto (String spz, String barva){
    this.spz = spz;
    this.barva = barva;

}
   public String toString(){
        return String.format("auto: %s", spz);
   }
}
