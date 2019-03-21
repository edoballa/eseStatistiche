/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatistiche;

import java.util.ArrayList;

/**
 *
 * @author ballabio_edoardo
 */
public class CDatiCondivisi {
    private int numCaratteri;
    private int numSpaziInseriti;
    private int numPuntiInseriti;
    private int numSpaziLetti;
    private int numPuntiLetti; 
    private char carEstratto;
    private ArrayList<String> buffer;

    public CDatiCondivisi(int numCaratteri, int numSpaziInseriti, int numPuntiInseriti, int numSpaziLetti, int numPuntiLetti) {
        this.numCaratteri = numCaratteri;
        this.numSpaziInseriti = numSpaziInseriti;
        this.numPuntiInseriti = numPuntiInseriti;
        this.numSpaziLetti = numSpaziLetti;
        this.numPuntiLetti = numPuntiLetti;
    }
    
    public CDatiCondivisi() {
        this.numCaratteri = 0;
        this.numSpaziInseriti = 0;
        this.numPuntiInseriti = 0;
        this.numSpaziLetti = 0;
        this.numPuntiLetti = 0;
        this.carEstratto = '/';
        buffer = new ArrayList<String>();
    }

    public synchronized int getNumCaratteri() {
        return numCaratteri;
    }

    public synchronized void setNumCaratteri(int numCaratteri) {
        this.numCaratteri = numCaratteri;
    }

    public synchronized int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public synchronized void setNumSpaziInseriti(int numSpaziInseriti) {
        this.numSpaziInseriti = numSpaziInseriti;
    }

    public synchronized int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public synchronized void setNumPuntiInseriti(int numPuntiInseriti) {
        this.numPuntiInseriti = numPuntiInseriti;
    }

    public synchronized int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public synchronized void setNumSpaziLetti(int numSpaziLetti) {
        this.numSpaziLetti = numSpaziLetti;
    }

    public synchronized int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public synchronized void setNumPuntiLetti(int numPuntiLetti) {
        this.numPuntiLetti = numPuntiLetti;
    }

    public synchronized char getCarEstratto() {
        return carEstratto;
    }

    public synchronized void setCarEstratto(char carEstratto) {
        this.carEstratto = carEstratto;
    }

    public synchronized ArrayList<String> getBuffer() {
        return buffer;
    }

    public synchronized void setBuffer(ArrayList<String> buffer) {
        this.buffer = buffer;
    }
    
    
}
