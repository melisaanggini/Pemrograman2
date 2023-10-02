package modul2;

import java.util.Scanner;

public class PRAK101_2210817220004_MelisaAnggini {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = inputan.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = inputan.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = inputan.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = inputan.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = inputan.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = inputan.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = inputan.nextFloat();

        String bulan = getBulan(bulanLahir);

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }
    public static String getBulan(int bulan) {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan - 1];
    }

}
