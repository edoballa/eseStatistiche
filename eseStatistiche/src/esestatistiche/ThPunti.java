/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

/**
 *
 * @author ballabio_edoardo
 */
public class ThPunti extends Thread{
    private CDatiCondivisi ptrDati;
    
    public ThPunti(CDatiCondivisi dati) {
        ptrDati = dati;
    }
    
    public void run() {
        for(int i=0; i<ptrDati.getNumCaratteri(); i++) {
            if(ptrDati.getCarEstratto() == '.') {
                ptrDati.setNumPuntiLetti(ptrDati.getNumPuntiLetti() + 1);
            }
        }
    }
}
