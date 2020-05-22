package ch05;

import java.util.Scanner;

public class R7_B2_1c {
    public static void main(String []args){
        Scanner x = new Scanner(System.in);
        
	System.out.print("Masukkan nilai m = ");
        int m = x.nextInt();
        
	System.out.print("Masukkan niali n = ");
        int n = x.nextInt();
        
	int a = m;
        int b = n;
        int r;

        while(n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        System.out.println("PBB ("+ a + "," + b + ") = " + m);
        }
    }