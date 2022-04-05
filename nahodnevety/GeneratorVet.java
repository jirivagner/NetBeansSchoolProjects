/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nahodnevety;
import java.util.Random;
/**
 *
 * @author J
 */
public class GeneratorVet {
    
    private  String [] podmet = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};
    private  String [] prisudek = {"spal", "ležel", "vařil", "uklízel", "derivoval"};
    private  String [] privlastek = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};
    private  String [] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se zpožděním"};
    private  String [] misto = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};
    
    public String vygenerujVetu (){
        Random random = new Random();
        return String.format("%s %s %s %s %s",privlastek [random.nextInt(privlastek.length)], podmet [random.nextInt(podmet.length)], prislovce [random.nextInt(prislovce.length)],prisudek [random.nextInt(prisudek.length)], misto [random.nextInt(misto.length)]);
    }

    public int faktorial(int n){
    int vysledek = 1;
    for (int i = n; i>0; i--){
        vysledek = i*vysledek;
    }
    
    return vysledek;
    }
    
    
}


    
            

//utomatizovaný manažer málo uklízel v lese
