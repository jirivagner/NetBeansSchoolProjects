/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.naklad;

/**
 *
 * @author J
 */
public class Naklad {
        public static void main(String[] args) {
        NakladniAuto truck = new NakladniAuto();

        truck.naloz(10000);
        truck.naloz(500);
        truck.vyloz(300);
        truck.vyloz(1000);
        System.out.println("V nákladním autě je naloženo " + truck.korba + " kg");
    }
}
