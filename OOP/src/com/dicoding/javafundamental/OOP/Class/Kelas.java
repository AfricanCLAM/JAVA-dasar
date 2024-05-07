package com.dicoding.javafundamental.OOP.Class;

public class Kelas {
 public static void main(String[] args) {

     String namaKucing = "atmin";
     int beratBadan = 7;

    class KucingAnggora {
       String nama = namaKucing;
       String berat = beratBadan + "kg";
    };

    KucingAnggora kucing = new KucingAnggora();

    System.out.println("nama  : " + kucing.nama);
    System.out.println("berat : " + kucing.berat);
 }
}