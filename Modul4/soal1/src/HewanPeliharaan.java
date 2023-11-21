import java.sql.SQLOutput;
import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    // Constructor
    public HewanPeliharaan(String n, String r) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        n = input.nextLine();
        this.nama = n;

        System.out.print("Ras: ");
        r = input.nextLine();
        this.ras = r;
    }

    // Method Display Output
    void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama Hewan Peliharaan adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}
