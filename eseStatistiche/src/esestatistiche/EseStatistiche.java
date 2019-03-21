/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.Scanner;

/**
 *
 * @author ballabio_edoardo
 */
public class EseStatistiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CDatiCondivisi dati = new CDatiCondivisi();
        ThGeneraCaratteri th1 = new ThGeneraCaratteri(dati);
        ThPunti th2 = new ThPunti(dati);
        ThSpazi th3 = new ThSpazi(dati);
        ThVisualizza th4 = new ThVisualizza(dati);
        
        System.out.println("Quanti caratteri vuoi generare?");
        int numDaGenerare = input.nextInt();
        dati.setNumCaratteri(numDaGenerare);
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }   
}
