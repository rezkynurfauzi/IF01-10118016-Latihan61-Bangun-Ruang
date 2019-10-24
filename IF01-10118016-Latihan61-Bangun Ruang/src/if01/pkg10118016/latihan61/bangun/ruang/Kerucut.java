/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan61.bangun.ruang;

/**
 *
 * @author Rezky
 */
public class Kerucut implements BangunRuang {
    private double r;
    private double t;
    private final double phi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    @Override
    public double hitungVolume() {
        return (1*phi*r*r*t)/3;
    }
    
}
