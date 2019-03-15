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
public class ThVisualizza extends Thread{
    private CDatiCondivisi PtrDati;
    
    public ThVisualizza(CDatiCondivisi dati) {
        PtrDati = dati;
    }
}
