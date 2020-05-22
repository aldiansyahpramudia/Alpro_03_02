package ch09;

import java.util.Arrays;
import java.util.Scanner;

public class R13_B2_3c{
    static void SieveOfSundaram(int n) {
        int nNew = (n - 2) / 2;

        boolean[] marked = new boolean[nNew + 1];

        Arrays.fill(marked, false);

        for (int i = 1; i <= nNew; i++)
            for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
                marked[i + j + 2 * i * j] = true;

        if (n > 2)
            System.out.print(2 + " ");

        for (int i = 1; i <= nNew; i++)
            if (!marked[i])
                System.out.print(2 * i + 1 + " ");
    }

    public static void main(String[] args) {

        System.out.println("Algoritma Sieve of Sundaram \n");

        Scanner a = new Scanner (System.in);
        System.out.print("Masukkan Batas Bilangan : ");
        int n = a.nextInt();
        System.out.print("Bilangan Prima kecil dari "+ n +" : ");
        SieveOfSundaram(n);
    }
}