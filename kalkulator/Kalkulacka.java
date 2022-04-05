/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulator;

/**
 *
 * @author J
 */
public class Kalkulacka {
    public double vydel(double a, double b)
            throws Exception{
        if (b == 0)
            throw new Exception("Nelze delit 0!");
        return a/b;
    }
}

