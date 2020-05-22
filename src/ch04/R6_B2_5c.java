package ch04;

public class R6_B2_5c {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka ganjil = ");
        int i = 0;
        while (i < angka.length) {
            int sisabagi = angka[i] % 2;

            if (sisabagi == 1) {

                System.out.print(angka[i]+" ");
            }
            i++;
        }
    }
}
