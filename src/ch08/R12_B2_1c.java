package ch08;

import java.util.Scanner;

public class R12_B2_1c{
    public static int LCSubstring(char[] X, char[] Y, int m, int n){

        int[][] LCSS = new int[m + 1][n + 1];
        int result = 0;

        for (int i = 0; i <= m; i++){
            for (int j = 0; j <= n; j++){
                if (i == 0 || j == 0)
                    LCSS[i][j] = 0;
                else if (X[i - 1] == Y[j - 1]){
                    LCSS[i][j] = LCSS[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCSS[i][j]);
                }
                else
                    LCSS[i][j] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(" Algoritma Longest Common Substring Problem \n");

        Scanner a = new Scanner (System.in);
        System.out.print(" Masukkan Nilai Bilangan String Pertama : ");
        String X = a.nextLine();

        System.out.print(" Masukkan Nilai Bilangan String Kedua : ");
        String Y = a.nextLine();

        int m = X.length();
        int n = Y.length();

        System.out.println(" Panjang Dari Longest Common Substring : "
                + LCSubstring(X.toCharArray(), Y.toCharArray(), m, n));
    }
}