/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodokmeny;

/**
 *
 * @author J
 */
public class Rodokmen {

    public Osoba ref;
    public Osoba ref2;

    public Rodokmen() {
        Osoba bart = new Osoba("Bart", "Simpson");
        Osoba homer = bart.nastavotce("Homer");
        Osoba abraham = homer.nastavotce("Abraham");
        Osoba penelope = homer.nastavmatku("Penelope", "Olsen");
        Osoba marge = bart.nastavmatku("Marge", "Bouvier");
        Osoba pan = marge.nastavotce("Pan");
        Osoba jackie = marge.nastavmatku("Jackie", "Bouvier");
        ref = bart;
        ref2 = homer;
    }

    public void vypisrodokmen(Osoba x) {
        System.out.println("Rodokmen pro osobu " + x);
        vypisrodice(x);
        System.out.println();
    }
    private void vypisrodice(Osoba x) {
        
        System.out.println(x);
        if (x.otec != null) {
            vypisrodice(x.otec);
        }
        if (x.matka != null) {
            vypisrodice(x.matka);
        }
    }

}
