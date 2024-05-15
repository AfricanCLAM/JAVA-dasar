package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("waktu sekarang : " + calendar.getTime());

        //menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal :" + calendar.get(calendar.get(Calendar.DATE)));
        System.out.println("Bulan   :" + calendar.get(calendar.get(Calendar.MONTH)));
        System.out.println("Tahun   :" + calendar.get(calendar.get(Calendar.YEAR)));
    }
}
