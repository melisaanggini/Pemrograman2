package soal1;

// Import the LinkedList class
import java.util.LinkedList;

// Buat Class dengan nama Dadu (a)
public class Dadu {
    private int inputUser;
    int total;

    // Encapsulation
    void setInput( int input ) {
        this.inputUser = input;
    }

    // Instansiasi Obj LinkedList
    LinkedList<Integer> ObjDadu = new LinkedList<Integer>();

    // Membuat method acakNilai() (b)
    void acakNilai() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            int nilaiAcak = 1 + (int)(Math.random() * 6);
            // Collection untuk menyimpan objek dadu {c}
            ObjDadu.add(nilaiAcak);
            // Menjumlahkan semua objek dadu
            this.total = this.total + nilaiAcak;
        }
    }

    void cetakDadu() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            // Cetak Output tiap objek dadu (f)
            System.out.println("Dadu ke-" + i + " bernilai " + ObjDadu.get(i-1));
        }
        // Cetak Output total jumlah objek dadu (g)
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}
