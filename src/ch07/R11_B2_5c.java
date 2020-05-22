package ch07;

public class R11_B2_5c{
    public void cocktailSort(int[] angka){
        boolean tukar = true;
        int start = 0;
        int end = angka.length;

        while (tukar){
            tukar = false;
            for (int i = start; i < end - 1; ++i){
                if (angka[i] > angka[i + 1]) {
                    int tes = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = tes;
                    tukar = true;
                }
            }
            if (!tukar)
                break;

            tukar = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--){
                if (angka[i] > angka[i + 1]) {
                    int tes = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = tes;
                    tukar = true;
                }
            }
            start = start + 1;
        }
    }

    public void printArray(int[] angka){
        int n = angka.length;
        int i = 0;
        while (i < n) {
            System.out.print(angka[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("Program Algoritma Cocktail Shaker Sort : \n");

        R11_B2_5c mot = new R11_B2_5c();
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        mot.cocktailSort(angka);
        System.out.println("Urutan Array Setelah di CocktailShakerSort : ");
        mot.printArray(angka);
    }

}