package com.dicoding.javafundamental.OOP.Function;

public class ReturnFunction {
    public static void main(String [] args) {
        double p = 7;
        double l = 6.5;
        double Hasil = HitungLuas (l,p) ;
        System.out.println("Hasilnya adalah : " + Hasil);
    }

    public static double HitungLuas(double panjang,double lebar) {
      double luas = panjang * lebar;
      return luas;
    }
}
