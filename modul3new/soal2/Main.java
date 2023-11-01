package soal2;

// Import Semua yang ada di package
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel penampung sementara
        String namaNegara = "", jenisKepemimpinan = "", namaPresiden = "";
        int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;

        // Instansiasi Scanner dengan nama input
        Scanner input = new Scanner(System.in);

        // Instansiasi LinkedList dengan nama ObjNegara
        LinkedList<Negara> ObjNegara = new LinkedList<Negara>();

        // Deklarasi inputUser untuk inputan
        int inputUser = input.nextInt();

        // Perulangan Untuk Input Properti Objek
        for (int i = 0; i < inputUser; i++){
            Negara tampungNegara = new Negara(namaNegara, jenisKepemimpinan, namaPresiden, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            tampungNegara.getData();
            ObjNegara.add(tampungNegara);
        }

        // Perulangan untuk menampilkan isi dari Objek
        for (int i = 0; i < ObjNegara.size(); i++){
            Negara Cetak = ObjNegara.get(i);
            Cetak.tampilkan();
        }
    }
}