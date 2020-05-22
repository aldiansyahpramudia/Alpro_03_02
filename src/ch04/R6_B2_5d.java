package ch04;

public class R6_B2_5d {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka kelipatan 3 = ");
        int i = 0;
        while (i < angka.length) {
            int sisabagi = angka[i] % 3;

            if (sisabagi == 0) {

                System.out.print(angka[i]+" ");
            }
            i++;
        }
    }
}