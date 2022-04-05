/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.piskvorky;

import java.util.Scanner;

/**
 *
 * @author J
 */
public class main {
    public static void vypisPole(int[][] plocha){
                //vyklreslení plochy
            System.out.println("  123456789");
            for (int radek = 0; radek < 9; radek++) {
                System.out.printf("%d ", radek + 1);
                for (int sloupec = 0; sloupec < 9; sloupec++) {
                    System.out.printf("%s", plocha[sloupec][radek] == 0 ? " " : (plocha[sloupec][radek] == 1 ? "O" : "X"));
                }
                System.out.println("");
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[][] plocha = new int[9][9];
        int[] smery = new int[]{-1, 0, 1};

        boolean konecHry = false;
        int tah = 0;
        boolean hrajeO = true;

        for (int radek = 0; radek < 9; radek++) {
            for (int sloupec = 0; sloupec < 9; sloupec++) {
                plocha[radek][sloupec] = 0;
            }
        }
        while (!konecHry) {
            //vyklreslení plochy
            vypisPole(plocha);
            
            System.out.printf("\nNa řadě je hráč s %s\n", hrajeO ? "kolečky" : "křížky");

            boolean souradniceOk = false;
            while (!souradniceOk) {
                System.out.println("Zadej pozici X kam chceš táhnout:");
                int X = Integer.parseInt(scanner.nextLine());
                System.out.println("Zadej pozici Y kam chceš táhnout:");
                int Y = Integer.parseInt(scanner.nextLine());
                if (X < 1 || X > 9 || Y < 1 || Y > 9) {
                    System.out.println("Neplatná pozice, zadej ji prosím znovu.");
                } else if (plocha[X - 1][Y - 1] != 0) {
                    System.out.println("Neplatná pozice, zadej ji prosím znovu.");
                } else {
                    plocha[X - 1][Y - 1] = hrajeO ? 1 : -1;

                    // konec hry                
                    for (int smerX : smery) {
                        for (int smerY : smery) {
                            if (smerX != 0 || smerY != 0) {
                                int shoda = 0;
                                int pozX = X - 1;
                                int pozY = Y - 1;
                                //System.out.printf("POZ: %d %d %d\n", pozX, pozY, shoda);
                                while (pozX >= 0 && pozX < 9 && pozY >= 0 && pozY < 9 && plocha[pozX][pozY] == (hrajeO ? 1 : -1)) {
                                    pozX += smerX;
                                    pozY += smerY;
                                    shoda++;
                                }
                                pozX = X - 1;
                                pozY = Y - 1;                              
                                while (pozX >= 0 && pozX < 9 && pozY >= 0 && pozY < 9 && plocha[pozX][pozY] == (hrajeO ? 1 : -1)) {
                                    pozX -= smerX;
                                    pozY -= smerY;
                                    shoda++;
                                }
                                //System.out.printf("%d %d %d\n", smerX, smerY, shoda);
                                if (shoda > 5 && !konecHry) {
                                    vypisPole(plocha);
                                    System.out.printf("Vyhrál hráč s %s\n", hrajeO ? "kolečky" : "křížky");
                                    konecHry = true;

                                }
                            }
                        }
                    }
                    tah++;
                    if (tah >= 81 && !konecHry) {
                        vypisPole(plocha);
                        System.out.println("Remíza.");
                        konecHry = true;
                    }
                    hrajeO = hrajeO ? false : true;
                    souradniceOk = true;
                }
            }

        }

    }

}
