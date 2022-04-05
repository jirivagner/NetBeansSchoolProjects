/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.nahodnevety;

/**
 *
 * @author J
 */
public class NahodneVety {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    GeneratorVet vety = new GeneratorVet();
    for (int i = 0; i<10; i++) {
        System.out.println(vety.vygenerujVetu());
    }
    
    System.out.println(vety.faktorial(5));
    
    
    }
    
}
