/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kamaradi;

/**
 *
 * @author J
 */
public class Clovek {

    private String jmeno;
    private int vek;
    private String kamarad;

    // Registrace člověka s parametry jméno a věk
    public void registrace(String jmeno1, int vek1) {
        jmeno = jmeno1;
        vek = vek1;
    }

    // Nechá skamarádit se s jiným člověkem
    public void kamaradi(Clovek clovek) {
        kamarad = clovek.jmeno;
    }
    // Představí se svým jménem, kolik mu je let a jméno jeho kamaráda
    public String predstavSe() {
        return String.format("Ahoj, já jsem %s, je mi %d let a můj kamarád je %s\n", jmeno, vek, kamarad);
    }
}
