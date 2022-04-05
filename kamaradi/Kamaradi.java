/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kamaradi;

/**
 *
 * @author J
 */
public class Kamaradi {

public static void main(String[] args) {
    
Clovek karel = new Clovek();
karel.registrace("Karel Novák", 33);

Clovek josef = new Clovek();
josef.registrace("Josef Nový", 27);

karel.kamaradi(josef);
josef.kamaradi(karel);

System.out.print(karel.predstavSe());
System.out.print(josef.predstavSe());
}
}
