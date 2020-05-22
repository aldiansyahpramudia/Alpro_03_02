package ch09;

import java.util.Scanner;

public class R13_B2_1c{
    static void SieveOfAtkin(int angka){
        if (angka > 2)
            System.out.print(2 + " ");

        if (angka > 3)
            System.out.print(3 + " ");
        boolean[] sieve = new boolean[angka];

        for (int i = 0; i < angka; i++)
            sieve[i] = false;
        for (int x = 1; x * x < angka; x++) {
            for (int y = 1; y * y < angka; y++) {

                int n = (4 * x * x) + (y * y);
                if (n <= angka && (n % 12 == 1 || n % 12 == 5))

                    sieve[n] ^= true;

                n = (3 * x * x) + (y * y);
                if (n <= angka && n % 12 == 7)
                    sieve[n] ^= true;

                n = (3 * x * x) - (y * y);
                if (x > y && n <= angka && n % 12 == 11)
                    sieve[n] ^= true;
            }
        }
        for (int r = 5; r * r < angka; r++) {
            if (sieve[r]) {
                for (int i = r * r; i < angka;
                     i += r * r)
                    sieve[i] = false;
            }
        }
        for (int a = 5; a < angka; a++)
            if (sieve[a])
                System.out.print(a + " ");
    }

    public static void main(String[] args){

        System.out.println("Algoritma Sieve of Atkin \n");

        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan batas Bilangan Prima : ");
        int angka = a.nextInt();

        System.out.print("Bilangan Prima Kecil dari "+angka+" : ");
        SieveOfAtkin(angka);
    }
}
