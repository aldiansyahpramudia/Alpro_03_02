package ch09;

import java.util.Scanner;

public class R13_B2_4c{
    static long[] c = new long[100];

    static void coef(int n){
        c[0] = 1;
        for (int i = 0; i < n; c[0] = -c[0], i++) {
            c[1 + i] = 1;

            for (int j = i; j > 0; j--)
                c[j] = c[j - 1] - c[j];
        }
    }
    static boolean isPrime(int n){
        coef(n);

        c[0]++;
        c[n]--;

        int i = n;
        while ((i--) > 0 && c[i] % n == 0);

        return i < 0;
    }

    public static void main(String[] args) {

        Scanner a = new Scanner (System.in);
        System.out.print(" Masukkan Bilangan yang Ingin Dites : ");
        int n = a.nextInt();
        if (isPrime(n))
            System.out.println(" " + n + " Bilangan Prima");
        else
            System.out.println(" " + n + " Bukan Bilangan Prima");
    }

}