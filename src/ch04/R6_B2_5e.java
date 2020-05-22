package ch04;

public class R6_B2_5e {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka yang memiliki angka 2 = ");
        int i = 0;
        while (i < angka.length) {
            int satuan = angka[i] - 2;
            int puluhan = angka[i] - 20;
	    
            for (int x = 0; x < 10; x++) {
                int kali = 10 * x;

                if (satuan == kali) {
                    System.out.print(angka[i] + " ");
                }else if (puluhan == x) {
                    System.out.print(angka[i] + " ");
                }
            }
            i++;
        }
    }
}