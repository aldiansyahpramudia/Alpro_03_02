package ch03;

import java.util.Scanner;

public class R5_B4_2c {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("=== Menentukan Pembagi Terkecil dari Suatu Bilangan ===");
        System.out.println("            === Selain Pembagi 1 dan 2 ===");
        System.out.print("Masukkan Angka   = ");
        int angka = x.nextInt();
       	int hasil;

        for (int pembagi = 3; pembagi <= angka; pembagi++) {
            hasil = angka % pembagi;

            if (hasil == 0) {
                System.out.println("Pembagi Terkecil = " + pembagi);
                break;
            }
        }

        if (angka <= 2) {
            System.out.println("Pembagi Terkecil = " + angka);
        }
    }
}