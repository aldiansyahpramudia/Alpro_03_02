package ch07;

public class R11_B2_5a {
    int [] angka = new int [] {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    int tes = 0;

    public void cetak(){
        System.out.println("Array Yang Diinput : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ", ");
        }


        for (int i = 0; i < angka.length; i++) {
            for (int j = i+1; j < angka.length; j++) {
                if(angka[i] < angka[j]) {
                    tes = angka[i];
                    angka[i] = angka[j];
                    angka[j] = tes;
                }
            }
        }

        System.out.println();

        System.out.println("\nUrutan Array Setelah Di Block Sort : ");
        int i = 0;
        while (i < angka.length) {
            System.out.print(angka[i] + ", ");
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        R11_B2_5a object = new R11_B2_5a();

        System.out.println("Algoritma Block Sort");
        System.out.println();
        object.cetak();

    }
}