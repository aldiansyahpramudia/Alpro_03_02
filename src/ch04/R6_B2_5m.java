package ch04;

public class R6_B2_5m {
    public static void main(String []args){

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int hasil = 0;

        System.out.print("Jumlah angka-angka selisih array = ");

        for(int i =0; i<angka.length-1; i++){

            int a = i+1;
            int selisih1 = angka[a]-angka[i];
            int selisih2 = angka[i]-angka[a];

            if(angka[a]>angka[i]){
                hasil+=selisih1;
            }else if(angka[i]>angka[a]){
                hasil+=selisih2;
            }
        }
        System.out.println(hasil);
    }
}
