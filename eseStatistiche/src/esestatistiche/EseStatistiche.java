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
public class EseStatistiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDatiCondivisi dati = new CDatiCondivisi();
        ThGeneraCaratteri th1 = new ThGeneraCaratteri(dati);
    }
    
}
