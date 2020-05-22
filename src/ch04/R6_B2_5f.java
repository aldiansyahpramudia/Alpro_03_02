package ch04;

public class R6_B2_5f {
    public static void main(String []args){
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka ganjil diapit angka genap = ");



        for (int i = 1; i < (angka.length)-1; i++){
            int a = i-1;
            int b = i+1;
            int sisabagi1 = angka[i]%2;
            int sisabagi2 = angka[a]%2;
            int sisabagi3 = angka[b]%2;


            if(sisabagi1==1){
                if((sisabagi2==0)&&(sisabagi3==0)){
                    System.out.print(angka[i]+" ");
                }
            }
        }
    }
}
