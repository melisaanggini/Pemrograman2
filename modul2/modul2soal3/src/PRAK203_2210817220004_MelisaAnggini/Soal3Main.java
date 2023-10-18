package PRAK203_2210817220004_MelisaAnggini;

public class Soal3Main {
    public static void main (String[] args) {
        Pegawai p1 = new Pegawai();
// pada baris ini terjadi error dikarenakan kurangnya tanda ;
//      p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan ("Assasin");

// beri value pada umur dikarenakan belum ada value
        p1.umur = 17;

// pada baris ini tidak sesuai dengan output, maka "Pegawai"  dihapus
//      System.out.println("Nama Pegawai: " +p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
// pada baris berikut masih kurang lengkap maka ditambahkan "tahun" untuk dicetak
//      System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + "tahun");

    }
}
