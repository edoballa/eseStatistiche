/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ballabio_edoardo
 */
public class ThGeneraCaratteri extends Thread{
    private char[] caratteri={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','.',' '};
    private CDatiCondivisi ptrDati;
    
    public ThGeneraCaratteri(CDatiCondivisi dati) {
        ptrDati = dati;
    }
    
    public void run() {
        for(int i = 0; i<ptrDati.getNumCaratteri(); i++) {
            try {
                Random rand = new Random();
                int numRandom = rand.nextInt(caratteri.length);
                
                ptrDati.waitSem1();
                
                ptrDati.setCarEstratto(caratteri[numRandom]);
                ptrDati.getBuffer().add(String.valueOf(ptrDati.getCarEstratto()));
                
                if(ptrDati.getCarEstratto() == '.') {
                    ptrDati.setNumPuntiInseriti(ptrDati.getNumPuntiInseriti()+1);
                }
                
                if(ptrDati.getCarEstratto() == ' ') {
                    ptrDati.setNumSpaziInseriti(ptrDati.getNumSpaziInseriti()+1);
                }
                
                ptrDati.signalSem2();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThGeneraCaratteri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
