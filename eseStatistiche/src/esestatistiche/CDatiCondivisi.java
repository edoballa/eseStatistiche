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
public class CDatiCondivisi {
    private int numCaratteri;
    private int numSpaziInseriti;
    private int numPuntiInseriti;
    private int numSpaziLetti;
    private int numPuntiLetti; 

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
    }

    public int getNumCaratteri() {
        return numCaratteri;
    }

    public void setNumCaratteri(int numCaratteri) {
        this.numCaratteri = numCaratteri;
    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public void setNumSpaziInseriti(int numSpaziInseriti) {
        this.numSpaziInseriti = numSpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public void setNumPuntiInseriti(int numPuntiInseriti) {
        this.numPuntiInseriti = numPuntiInseriti;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public void setNumSpaziLetti(int numSpaziLetti) {
        this.numSpaziLetti = numSpaziLetti;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void setNumPuntiLetti(int numPuntiLetti) {
        this.numPuntiLetti = numPuntiLetti;
    }
}
