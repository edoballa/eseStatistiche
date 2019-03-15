/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.Random;

/**
 *
 * @author ballabio_edoardo
 */
public class ThGeneraCaratteri extends Thread{
    private char[] caratteri={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','.',' '};
    private CDatiCondivisi PtrDati;
    
    public ThGeneraCaratteri(CDatiCondivisi dati) {
        PtrDati = dati;
    }
    
    public void run() {
        for(int i = 0; i<PtrDati.getNumCaratteri(); i++) {
            Random rand = new Random();
            int numRandom = rand.nextInt();
        }
    }
}
