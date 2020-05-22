package ch04;

public class R6_B2_5l {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap = ");

        for(int i =0; i<angka.length-1; i++){

            int a = i+1;
            int jumlah = angka[i]+angka[a];
            int genap = jumlah%2;

            if(genap==0){
                System.out.print(jumlah + " ");
            }
        }
    }
}
