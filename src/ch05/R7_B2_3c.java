package ch05;

import java.util.Scanner;

public class R7_B2_3c {

    int lcs(char[] X, char[] Y, int m, int n){

        int[][] T = new int[m+1][n+1];

        for(int i=0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    T[i][j] = 0;
                } else if (X[i-1] == Y[j-1]) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                } else {
                    T[i][j] = max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
        return T[m][n];
    }

    int max(int a, int b){

        return Math.max(a, b);
    }
    public static void main(String []args){

        R7_B2_3c lcs = new R7_B2_3c();

        System.out.println("Algoritma Longest Common Subsequence");

        Scanner a = new Scanner (System.in);
        System.out.print(" Masukkan Bilangan Pertama : ");
        String s1 = a.nextLine();

        Scanner b = new Scanner (System.in);
        System.out.print(" Masukkan Bilangan Kedua : ");
        String s2 = b.nextLine();

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("LCS = " + lcs.lcs(X, Y, m, n));
    }
}
