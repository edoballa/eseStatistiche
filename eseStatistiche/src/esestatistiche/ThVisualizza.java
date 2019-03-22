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
public class ThVisualizza extends Thread{
    private CDatiCondivisi ptrDati;
    
    public ThVisualizza(CDatiCondivisi dati) {
        ptrDati = dati;
    }
    
    public void run() {
        for(int i=0; i<ptrDati.getNumCaratteri(); i++) {
            try {
                ptrDati.waitSem4();
                System.out.println(" ");
                System.out.println(ptrDati.getBuffer().toString());
                System.out.println("Il numero di spazi inseriti è " + ptrDati.getNumSpaziInseriti());
                System.out.println("Il numero di punti inseriti è " + ptrDati.getNumPuntiInseriti());
                System.out.println("Il numero di spazi letti è " + ptrDati.getNumSpaziLetti());
                System.out.println("Il numero di punti letti è " + ptrDati.getNumPuntiLetti());
                ptrDati.signalSem1();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThVisualizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
