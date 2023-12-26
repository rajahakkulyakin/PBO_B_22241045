package com.tutorial;

class Pegawai {
    private String namaPegawai;
    private String jabatan;
    private double gajiPokok;
    private double pajak;
    // Constructor
    public Pegawai() {
    }
    // Setter methods
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
    // Getter methods
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public String getJabatan() {
        return jabatan;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public double getPajak() {
        return pajak;
    }
    // Method untuk menghitung gaji total
    public double Gajibersih() {
        return gajiPokok - (gajiPokok * pajak);
    }
}
public class HitungGajiPegawai {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai = new Pegawai();

        // Input data pegawai menggunakan setter
        pegawai.setNamaPegawai("Pablito");
        pegawai.setJabatan("Dosen");
        pegawai.setGajiPokok(3500000);
        pegawai.setPajak(0.1);

        // Menampilkan hasil menggunakan getter
        System.out.println("\n===== Gaji Pegawai =====");
        System.out.println("Nama Pegawai: " + pegawai.getNamaPegawai());
        System.out.println("Jabatan : " + pegawai.getJabatan());
        System.out.println("Gaji Pokok   : " + pegawai.getGajiPokok());
        System.out.println("Gaji bersih : " + pegawai.Gajibersih());
    }
}