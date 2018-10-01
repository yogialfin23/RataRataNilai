package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mhs1;
        float rataan, nilai1;
        int mhs = 1;
        float nilai = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Banyak Mahasiswa : " );
        mhs1 = sc.nextInt();

        while (mhs <= mhs1){
            System.out.print("Nilai Mahasiswa ke- " +mhs+ " : ");
            nilai1 = sc.nextFloat();
            mhs = mhs + 1;
            nilai = nilai + nilai1;
        }

            rataan = nilai / mhs1;

        System.out.println("Maka, Rata-Rata Nilainya adalah " +rataan);


    }
}
