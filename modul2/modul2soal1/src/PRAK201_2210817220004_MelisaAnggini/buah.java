package PRAK201_2210817220004_MelisaAnggini;

import static java.lang.Math.floor;
public class buah {
    // Membuat Class
    String namaBuah;
    double beratBuah;
    double hargaBuah;
    double jumlahBeli;
    double diskon = 0.02;
    double hargaSebelumDiskon;
    double totalDiskon;
    double hargaSetelahDiskon;


    // Constructor dengan Parameter
    public buah(String namaBuah, double beratBuah, double hargaBuah, double jumlahBeliBuah) {
        // Memasukkan Nilai Ke dalam Object
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.hargaBuah = hargaBuah;
        this.jumlahBeli = jumlahBeliBuah;
        hargaSebelumDiskon = (jumlahBeli / beratBuah) * hargaBuah;
        totalDiskon = (floor(jumlahBeli / 4)) * (hargaBuah * diskon * 4);
        hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;


        // Menampilkan Nilai Object
        System.out.println("Nama Buah : " + this.namaBuah);
        System.out.println("Berat : " + this.beratBuah + " kg");
        System.out.println("Harga : " + this.hargaBuah);
        System.out.println("Jumlah Beli : " + this.jumlahBeli + " kg");
        System.out.println("Harga Sebelum Diskon : Rp " + hargaSebelumDiskon);
        System.out.println("Total Diskon : Rp " + totalDiskon);
        System.out.println("Harga Setelah Diskon : Rp " + hargaSetelahDiskon);
    }
}
