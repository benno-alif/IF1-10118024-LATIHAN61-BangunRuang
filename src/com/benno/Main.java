package com.benno;

	/*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung bangun ruang Bola, Tabung, dan Kerucut
     */

public class Main {

    public static void main(String[] args) {
    	Bola bola = new Bola();
    	Tabung tabung = new Tabung();
    	Kerucut kerucut = new Kerucut();

    	bola.setR(7);
    	tabung.setR(10);
    	tabung.setH(21);
    	kerucut.setR(14);
    	kerucut.setH(9);

		System.out.println("Jari-jari dari sebuah bola basket adalah " + bola.getR() + " cm");
		System.out.println("Hasil : V = " + String.format("%.1f", bola.hitungVolume()) + " cm kubik\n");

		System.out.println("Sebuah tabung memiliki jari-jari " + tabung.getR() + " cm. Jika tingginya " + tabung.getH() + " cm");
		System.out.println("Hasil : V = " + String.format("%.1f" ,tabung.hitungVolume()) + " cm kubik\n");

		System.out.println("Diketahui tinggi sebuah kerucut  " + kerucut.getH() + " cm. Jika jari-jarinya " + kerucut.getR() + " cm");
		System.out.println("Hasil : V = " + String.format("%.1f",kerucut.hitungVolume()) + " cm kubik\n");
    }
}
