package soal3;

// deklarasi nama class
public class Mahasiswa {
    private String nama;
    private String nim;

    // constructor class Mahasiswa
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // metode untuk mengakses nilai variabel
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
