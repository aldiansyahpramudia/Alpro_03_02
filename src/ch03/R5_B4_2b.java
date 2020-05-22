package ch03;

import java.util.Scanner;

public class R5_B4_2b {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);

        System.out.println("=== Menentukan Nilai Tertinggi ===");
            int x,y,z;
        System.out.print("Masukkan nilai x = ");
            x = nilai.nextInt();
        System.out.print("Masukkan nilai y = ");
            y = nilai.nextInt();
        System.out.print("Masukkan nilai z = ");
            z = nilai.nextInt();

        if ((x >= y)&&(x >= z)) {
            System.out.println("Nilai tertinggi antara variabel x, y, dan z adalah " + x);
        }else if((y >= x)&&(y >= z)) {
            System.out.println("Nilai tertinggi antara variabel x, y, dan z adalah " + y);
        }else if((z >= x)&&(z >= y)) {
            System.out.println("Nilai tertinggi antara variabel x, y, dan z adalah " + z);
        }
    }
}
