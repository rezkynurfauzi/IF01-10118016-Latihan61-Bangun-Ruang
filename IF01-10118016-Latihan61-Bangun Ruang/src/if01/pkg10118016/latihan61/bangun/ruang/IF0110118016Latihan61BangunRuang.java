/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan61.bangun.ruang;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Bangun Ruang
 */

public class IF0110118016Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====BOLA=====");
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah " + bola.getR() + " cm");
        System.out.printf("Hasil : V = %.1f cm³\n" ,bola.hitungVolume());
        
        System.out.println("\n=====TABUNG=====");
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Sebuah tabung memiliki jari-jari berukuran " + tabung.getR() + " cm. Jika tingginya " + tabung.getT() + "cm,");
        System.out.printf("Hasil V = %.1f cm³\n" ,tabung.hitungVolume());
        
        System.out.println("\n=====KERUCUT=====");
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Diketahui tinggi sebuah kerucut " + kerucut.getT() + " cm. Jika jari-jarinya " + kerucut.getR() + "cm,");
        System.out.printf("Hasil : V = %.1f cm³" ,kerucut.hitungVolume());
    }
    
}
