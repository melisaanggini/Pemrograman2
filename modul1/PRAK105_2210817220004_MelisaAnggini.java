package modul2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2210817220004_MelisaAnggini {
    // Membuat Konstanta untuk phi
    public static final double PHI = 3.14;

    public static void main(String[] args) {

        // Deklarasi
        double jariJari, tinggiTabung, hasil;

        Scanner keyboard = new Scanner(System.in);

        // inputUser
        System.out.print("Masukkan jari-jari: ");
        jariJari = keyboard.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggiTabung = keyboard.nextDouble();

        // Rumus Volume Tabung
        hasil = PHI * (jariJari * jariJari) * tinggiTabung;
        DecimalFormat df = new DecimalFormat("#.###");

        // Cetak Hasil
        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan");
        System.out.println("tinggi " + tinggiTabung + " cm adalah " + df.format(hasil) + " m3");
    }

}
