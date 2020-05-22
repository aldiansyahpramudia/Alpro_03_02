package ch05;

public class R7_B2_2c{
    int[] array1 = {2, 3, -4, -1, -2, 9, -1, 4};
    int[] array2 = { 2, -4, -3, -2, 8, -1, -2, 10 };
    public int kandane(int[] angka1) {
        int maksimum = 0;
        int maks = 0;
        int i = 0;
        while (i < angka1.length) {
            maksimum += angka1[i];
            if (maksimum < 0) {
                maksimum = 0;
            }
            if (maks < maksimum) {
                maks = maksimum;
            }
            i++;
        }
        return maks;
    }
    public int KandaneModify(int[] angka1) {
        int maksimum = angka1[0];
        int maks = angka1[0];
        for(int i=1;i<angka1.length;i++){
            maksimum = Math.max(angka1[i], maksimum+angka1[i]);
            maks = Math.max(maks,maksimum);
        }
        return maks;
    }
    public void cetak1(){
        int i = 0;
        while (i < array1.length) {
            System.out.print(array1[i]+", " );

            i++;
        }
    }
    public void cetak2(){
        int i = 0;
        while (i < array2.length) {
            System.out.print(array2[i]+", " );

            i++;
        }
    }

    public static void main(String[] args) {

        System.out.println(" Program Algoritma Kadane : Menentukan Nilai Maximum dari Subarray");
        System.out.println();

        R7_B2_2c i = new R7_B2_2c();
        int[] angka1= { 2, 3, -4, -1, -2, 9, -1, 4 };
        i.cetak1();
        System.out.println();
        System.out.println("Maximum subarray : " + i.kandane(angka1));

        int[] angka2 = { 2, -4, -3, -2, 8, -1, -2, 10 };
        i.cetak2();
        System.out.println();
        System.out.println("Maximum Subarray : " + i.KandaneModify(angka2));
    }
}