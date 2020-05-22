package ch04;

public class R6_B2_5h  {
    public static void main(String []args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int hasil = 0;

        int i = 0;
        while (i < angka.length) {

            hasil += angka[i];
            i++;
        }

        System.out.println("Jumlah angka dalam array = " + hasil);
    }
}
