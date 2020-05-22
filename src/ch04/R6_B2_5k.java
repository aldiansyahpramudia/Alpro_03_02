package ch04;

public class R6_B2_5k {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka yang setalahnya bernilai lebih besar = ");
        for (int i = 0; i < angka.length-1; i++) {

            int a = i+1;

            if(angka[a]>angka[i]){
                System.out.print(angka[i] + " ");
            }
        }
    }
}
