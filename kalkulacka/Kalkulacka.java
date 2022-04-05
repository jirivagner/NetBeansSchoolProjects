/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulacka;
import java.util.*;


/**
 *
 * @author J
 */
public class Kalkulacka {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Zadej 1. číslo:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Zadej 2. číslo:");
        double b = Double.parseDouble(scanner.nextLine());
 
       
        KalkulackaBack kalkulackaBack = new KalkulackaBack();
        
        kalkulackaBack.vstup1 = a;
        kalkulackaBack.vstup2 = b;
        
        
        System.out.println("Součet: " + kalkulackaBack.soucet());
        System.out.println("Rozdíl: " + kalkulackaBack.rozdil());
        System.out.println("Součin: " + kalkulackaBack.soucin());
        System.out.println("Podíl: " + kalkulackaBack.podil());
    }
}
