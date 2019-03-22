/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ballabio_edoardo
 */
public class ThSpazi extends Thread{
    private CDatiCondivisi ptrDati;
    
    public ThSpazi(CDatiCondivisi dati) {
        ptrDati = dati;
    }
    
    public void run() {
        for(int i=0; i<ptrDati.getNumCaratteri(); i++) {
            try {
                ptrDati.waitSem3();
                if(ptrDati.getCarEstratto() == ' ') {
                    ptrDati.setNumSpaziLetti(ptrDati.getNumSpaziLetti()+1);
                }
                ptrDati.signalSem4();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThSpazi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
