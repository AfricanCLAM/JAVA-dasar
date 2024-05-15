package com.dicoding.javafundamental.Exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D://file.txt");
            FileReader fr = new FileReader(file);

            System.out.println("read file berhasil!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
