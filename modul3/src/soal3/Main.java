package soal3;

// mengimpor class ArrayList dan Scanner
import java.util.ArrayList;
import java.util.Scanner;

// deklarasi nama class
public class Main {
    public static void main(String[] args) {

        // collection ArrayList untuk menyimpan objek Mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner pilihlah = new Scanner(System.in);

        boolean ketikamulai = true;
        while (ketikamulai) {
            // cetak menu pilihan
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan seluruh data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int menu = pilihlah.nextInt();
            // membaca newline setelah pilihan
            pilihlah.nextLine(); // Menggunakan ini untuk membaca newline setelah membaca pilihan

            // opsi dalam switch case
            switch (menu) {
                case 1:
                    System.out.print("Masukan Nama Mahasiswa: ");
                    String nama = pilihlah.nextLine();
                    System.out.print("Masukan NIM Mahasiswa (harus unik): ");
                    String nim = pilihlah.nextLine();
                    Mahasiswa mahasiswaBaru = new Mahasiswa(nama, nim);
                    daftarMahasiswa.add(mahasiswaBaru);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = pilihlah.nextLine();
                    Mahasiswa mahasiswadelete = null;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimHapus)) {
                            mahasiswadelete = mhs;
                            break;
                        }
                    }
                    if (mahasiswadelete != null) {
                        daftarMahasiswa.remove(mahasiswadelete);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String nimCari = pilihlah.nextLine();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Data Mahasiswa:");
                            System.out.println("Nama: " + mhs.getNama());
                            System.out.println("NIM: " + mhs.getNim());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println("NIM : " + mhs.getNim()+ ", Nama: " + mhs.getNama());
                    }
                    break;
                case 0:
                    ketikamulai = false;
                    daftarMahasiswa.clear();
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tdak ada, silahkan ulang");
                    break;
            }
        }
        pilihlah.close();
    }
}