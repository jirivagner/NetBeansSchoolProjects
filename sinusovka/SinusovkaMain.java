/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sinusovka;

/**
 *
 * @author J
 */
public class SinusovkaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[][] buffer = new char[80][25];

        for (int radek = 0; radek < 25; radek++) {
            for (int sloupec = 0; sloupec < 80; sloupec++) {
                buffer[sloupec][radek] = ' ';
            }
        }
        for (int x = 0; x < 80; x++) {
            int y = (int) Math.round(Math.sin(x / 80.0 * Math.PI * 2) * 8) + 12;
            buffer[x][y] = '█';
        }
        for (int radek = 0; radek < 25; radek++) {
            for (int sloupec = 0; sloupec < 80; sloupec++) {
                System.out.printf("%s", buffer[sloupec][radek]);

            }
            System.out.println();
        }

    }
}


██                                   ██                                    █