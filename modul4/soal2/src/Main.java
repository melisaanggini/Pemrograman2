import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");

        System.out.print("Masukkan pilihan: ");
        int pilihan = inputan.nextInt();
        inputan.nextLine();

        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = inputan.nextLine();
            System.out.print("Ras: ");
            String ras = inputan.nextLine();

            if (pilihan == 1) {
                System.out.print("Warna Bulu: ");
                String warnaBulu = inputan.nextLine();
                Kucing kucing = new Kucing(nama, ras, warnaBulu);
                kucing.displayDetailKucing();

            } else {
                System.out.print("Warna Bulu: ");
                String warnaBulu = inputan.nextLine();
                System.out.print("Kemampuan : ");
                String[] kemampuan = new String[] {inputan.nextLine()};
                Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
                anjing.displayDetailAnjing();
            }
        } else {
            System.out.println("Pilihan Tidak Valid.");
        }
    }
}