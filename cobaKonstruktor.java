package com.tutorial;
class Mahasiswa {
    // Data Member/Ciri/Atribut
    String Nama;
    String NIM;
    String Prodi;

    //Membuat konstruktor tanpa parameter
    // Mahasiswa(){
    //     System.out.println("Ini adalah konstruktor");

    // }

    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi) {
        Nama = inputNama;
        NIM = inputNIM;
        Prodi = inputProdi;
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + Prodi);


    }

}

public class cobaKonstruktor {
    
    public static void main(String[] args) {
        //instansiasi objek / penciptaan objek
    new Mahasiswa("Paras Suni Juniarti","22241049","PTI");
        



    }
}