/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auta;

/**
 *
 * @author J
 */
public class Garaz {
    
 public Auto faro;
 public void zaparkuj(Auto auticko){
   faro = auticko;
 }
 public String vypis(){
     
     return String.format("V garáži je %s", faro);
 }
}
