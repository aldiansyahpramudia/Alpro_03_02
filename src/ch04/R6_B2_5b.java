package ch04;

import java.util.Scanner;

public class R6_B2_5b {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        Scanner x = new Scanner(System.in);

        System.out.print("Mencari angka = ");
        int nilai = x.nextInt();
        boolean hasil = false;

        for (int i = 0; i < angka.length; i++) {

            if(nilai == angka[i]) {
                hasil = true;
            }
        }
        if (hasil) {
            System.out.println("Angka " + nilai + " ditemukan");
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}