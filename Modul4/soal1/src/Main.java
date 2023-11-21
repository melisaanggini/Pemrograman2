
import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Deklarasi variabel penampung
        String nama = null, ras = null;

        // Scanner input
        Scanner input = new Scanner(System.in);

        // Inisiasi Object Hewan Peliharaan dengan nama HewanPeliharaan
        HewanPeliharaan hewan = new HewanPeliharaan(nama, ras);

        hewan.display();
    }
}