/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodokmeny;

/**
 *
 * @author J
 */
public class Osoba {

    private String jmeno;
    private String prijmeni;

    public Osoba matka;
    public Osoba otec;

    public Osoba(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }
     

    public String toString() {
        return String.format("%s %s", jmeno, prijmeni);
        
    }

    
    public Osoba nastavotce(String j){
        
        Osoba x = new Osoba(j, prijmeni);
        otec = x;
        return x;
    }
    
    public Osoba nastavmatku(String j, String p){
         Osoba x = new Osoba(j, p);
        matka = x;
        return x;
    }
    
    
}
