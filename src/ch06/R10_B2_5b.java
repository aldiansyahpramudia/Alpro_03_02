package ch06;

public class R10_B2_5b {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for(int i = 1; i < angka.length; i++){
            for(int j = i; j >= 1; j--){

                if(angka[j] < angka[j-1]) {

                    int tes = angka[j];
                    angka[j] = angka[j - 1];
                    angka[j - 1] = tes;
                }
            }
        }
        int i = 0;
        while (i < angka.length) {
            System.out.print(angka[i] + " ");
            i++;
        }
    }
}
