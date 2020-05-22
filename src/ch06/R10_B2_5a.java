package ch06;

public class R10_B2_5a {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for(int i = 0; i < angka.length-1; i++){
            for(int j = i+1; j < angka.length; j++){

                if(angka[i] > angka[j]){
                    int tes = angka[i];
                    angka[i] = angka[j];
                    angka[j] = tes;
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
