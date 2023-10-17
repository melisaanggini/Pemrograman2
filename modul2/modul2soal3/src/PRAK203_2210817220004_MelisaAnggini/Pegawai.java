package PRAK203_2210817220004_MelisaAnggini;

// pada baris ini terjadi error karena pemberian nama public class harus sama dengan nama file .java
// public class Employee {

public class Pegawai {
    public String nama;
//  ubah tipe data pada baris berikut menjadi bentuk String
//  public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }

// Pada baris ini terjadi error karena tipe data yang tidak kompatibel antara char dengan String
// ubah deklarasi tipe data asal dari bentuk char menjadi String
    public String getAsal() {
        return asal;
    }

// Pada baris ini terjadi error karena tidak adanya pendeklarasian variabel j pada baris sebelumnya
//  public void setJabatan() {
    public void setJabatan (String j){
        this.jabatan = j;
    }
}
