package ch04;

public class R6_B2_5n {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya");

        int hasil = 0;
        int i =0;
        while (i<angka.length) {

            int sebelum = angka[i]-1;
            int jumlah = angka[i]+sebelum;
            hasil = hasil + jumlah;

            i++;
        }
        System.out.println(hasil);
    }
}
