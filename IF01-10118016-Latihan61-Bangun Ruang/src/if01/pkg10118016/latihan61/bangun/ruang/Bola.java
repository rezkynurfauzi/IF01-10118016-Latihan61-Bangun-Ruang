/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan61.bangun.ruang;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Bangun Ruang
 */

public class Bola implements BangunRuang {
    private double r;
    private final double phi = 3.14;

    public double getR() {
        return this.r;
    }

    public double getPhi() {
        return this.phi;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
    @Override
    public double hitungVolume() {
        return (4*phi*r*r*r)/3;
    }
   
    
}
