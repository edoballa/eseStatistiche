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
    private CDatiCondivisi PtrDati;
    
    public ThPunti(CDatiCondivisi dati) {
        PtrDati = dati;
    }
}
