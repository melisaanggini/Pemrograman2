package modul2;

import java.util.Scanner;

public class PRAK101_2210817220004_MelisaAnggini {
    public static void main(String[] args) {
        String namaLengkap, tempatLahir;
        int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
        float beratBadan;

        Scanner keyboard = new Scanner(System.in);

        // Nama Lengkap
        System.out.print("Masukkan Nama Lengkap: ");
        namaLengkap = keyboard.nextLine();
        // Tempat Lahir
        System.out.print("Masukkan Tempat Lahir: ");
        tempatLahir = keyboard.nextLine();

        // Tanggal Lahir
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggalLahir = keyboard.nextInt();

        // Bulan Lahir
        System.out.print("Masukkan Bulan Lahir: ");
        bulanLahir = keyboard.nextInt();

        // Tahun Lahir
        System.out.print("Masukkan Tahun Lahir: ");
        tahunLahir = keyboard.nextInt();

        // Tinggi Badan
        System.out.print("Masukkan Tinggi Badan: ");
        tinggiBadan = keyboard.nextInt();

        // Berat Badan
        System.out.print("Masukkan Berat Badan: ");
        beratBadan = keyboard.nextFloat();

        // Mengatur Bulan
        String a = "";
        switch(bulanLahir){
            case 1:
                a = "Januari";
                break;
            case 2:
                a = "Februari";
                break;
            case 3:
                a = "Maret";
                break;
            case 4:
                a = "April";
                break;
            case 5:
                a = "Mei";
                break;
            case 6:
                a = "Juni";
                break;
            case 7:
                a = "Juli";
                break;
            case 8:
                a = "Agustus";
                break;
            case 9:
                a = "September";
                break;
            case 10:
                a = "Oktober";
                break;
            case 11:
                a = "November";
                break;
            case 12:
                a = "Desember";
                break;
        }

        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " +
                tempatLahir + " pada Tanggal " + tanggalLahir + " " + a + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan "
                + beratBadan + " kilogram");
    }
}
