/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lide1;

/**
 *
 * @author J
 */
public class Programator extends Clovek implements Pracujici{
    
 
    private String jazyk;
    
    public Programator(String jmeno, int vek, String jazyk){
        super(jmeno,vek);
        this.jazyk = jazyk;
    }
    
    public void pracuj(){
System.out.println("Pilně programuji!");
    }
    public void pozdrav(){
        System.out.println("Hello World");
    }
    
    public String getJazyk(){
        return jazyk;
    }
    public void pozdrav(String pozdrav){
     
     System.out.printf(" %s, já jsem %s a je mi %d let a umím %s\n", pozdrav, jmeno, vek, jazyk);
}
}
