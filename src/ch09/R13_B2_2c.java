package ch09;

import java.util.Scanner;

public class R13_B2_2c{
    static void sieveOfEratosthenes(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p])
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i])
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        System.out.println("Algoritma Sieve Of Eratosthenes \n");

        Scanner a = new Scanner (System.in);
        System.out.print("Masukkan Batas Bilangan : ");
        int n = a.nextInt();

        System.out.print("Bilangan Prima kecil dari " + n +" : ");

        sieveOfEratosthenes(n);
    }
}