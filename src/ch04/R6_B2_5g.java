package ch04;

public class R6_B2_5g {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka kelipatan 5 yang sebelum nya angka kelipatan 5 = ");

        for (int i = 0; i < angka.length-1; i++) {

            int a = i + 1;
            int sisabagi1 = angka[i] % 5;
            int sisabagi2 = angka[a] % 5;

            if ((sisabagi1 == 0)&&(sisabagi2 == 0)) {
                    System.out.print(angka[a] + " ");
            }
        }
    }
}