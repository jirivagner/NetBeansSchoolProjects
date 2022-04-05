/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prochazeni;

import java.util.Scanner;

/**
 *
 * @author J
 */
public class Hra {
    
    public Lokace pozice;

    public Hra() {
        Lokace dum = new Lokace("Dům", "Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n"
                + "z hromady vedle vstupních dveří.");
        Lokace les = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace rybnik = new Lokace("Rybník", "Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n"
                + "od tebe je dřevěná plošina se stavidlem.");
        Lokace les2 = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace rozcesti = new Lokace("Lesní rozcestí", "Nacházíš se na lesním rozcestí.");
        Lokace les3 = new Lokace("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n"
                + "slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");
        Lokace hrad = new Lokace("Hrad", "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti.\n"
                + "Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");

        hrad.vychod = les;
        les.zapad = hrad;
        les.vychod = rozcesti;
        rozcesti.zapad = les;
        rozcesti.vychod = les2;
        les2.zapad = rozcesti;
        les2.vychod = rybnik;
        rybnik.zapad = les2;
        rozcesti.jih = les3;
        les3.sever = rozcesti;
        les3.vychod = dum;
        dum.zapad = les3;

        pozice = dum;

    }
    private void jdinapozici(Lokace x) {
        if (x == null) {
            System.out.println("Tímto směrem nelze jít.");
            krok();
        } else {
            pozice = x;
        }
    }

    public void krok() {
        pozice.vypispozici();
        System.out.println();
        System.out.println("Zadej příkaz:");
        Scanner scanner = new Scanner(System.in);
        String vstup = scanner.nextLine();

        if (vstup.equalsIgnoreCase("jdi na sever")) {
            jdinapozici(pozice.sever);
        } else if (vstup.equalsIgnoreCase("jdi na jih")) {
            jdinapozici(pozice.jih);
        } else if (vstup.equalsIgnoreCase("jdi na západ")) {
            jdinapozici(pozice.zapad);
        } else if (vstup.equalsIgnoreCase("jdi na východ")) {
            jdinapozici(pozice.vychod);
        } else if(vstup.equalsIgnoreCase("konec")){
    return;    }
          else {
            System.out.println("Můj vstupní slovník neobsahuje tento příkaz.");
        } 
        krok();
        }
    }
