package ch07;

public class R11_B2_5b{
    public void merge(int[] angka, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int [n1];
        int[] R = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = angka[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = angka[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                angka[k] = L[i];
                i++;
            }
            else{
                angka[k] = R[j];
                j++;
            }k++;
        }

        while (i < n1){
            angka[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            angka[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int[] angka, int l, int r){
        if (l < r){
            int m = (l+r)/2;
            sort(angka, l, m);
            sort(angka , m+1, r);
            merge(angka, l, m, r);
        }
    }
    public static void printArray(int[] angka) {
        int n = angka.length;
        for (int i=0; i<n; ++i)
            System.out.print(angka[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        System.out.println("Program Algoritma Merge Sort : \n");

        R11_B2_5b mot = new R11_B2_5b();
        System.out.println("Array Yang Diinputkan : ");
        printArray(angka);

        mot.sort(angka, 0, angka.length-1);
        System.out.println("\nArray Setelah Di Merge Sort : ");
        printArray(angka);
    }
}