/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.naklad;

/**
 *
 * @author J
 */
public class NakladniAuto {
        int kapacita = 3000;
    int korba;

    public void naloz(int naloz){
        // Jestliže je pro naložení dostatek místa v korbě, nalož náklad do korby
        if (korba + naloz < kapacita){
            korba += naloz;
        }
    }

    public void vyloz(int vyloz){
    // Jestliže je množství v korbě větší než množství které chci vyložit, vylož náklad z korby
        if (vyloz < korba){
            korba -= vyloz;

        }
    }
}
