package PRAK202_2210817220004_MelisaAnggini;

public class kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;
    void info() {

        System.out.println("Nama Kopi: " + this.namaKopi);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Harga: Rp. " + this.harga);
    }

    void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    String getPembeli() {
        return this.pembeli;
    }

    double getPajak() {
        double pajak = harga * 11 / 100;
        return pajak;
    }
}
