package ch03;

import java.util.Scanner;

public class R5_B4_2d {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("=== Menentukan Bilangan Prima ===");
        System.out.print("Masukkan Angka = ");
        int angka = x.nextInt();
        boolean prima = true;

        int hasil;
        for(int pembagi = 2; pembagi <= angka/2; pembagi++){
            hasil = angka%pembagi;

            if(hasil==0){
                prima = false;
            }
        }

        if(prima&&((angka > 0)&&(angka != 1))){
            System.out.println(angka + " Merupakan Bilangan Prima");
        }else{
            System.out.println(angka + " Bukan Merupakan Bilangan Prima");
        }
    }
}