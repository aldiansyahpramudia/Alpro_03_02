package ch05;

class R7_B2_4c{
    int lis(int[] angka,int n){
        int []lis = new int[n];
        int i,j,max = 0;

        for ( i = 0; i < n; i++ )
            lis[i] = 1;

        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( angka[i] > angka[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        for ( i = 0; i < n; i++ )
            if ( max < lis[i] )
                max = lis[i];

        return max;
    }

    public static void main(String[] args){
        int[] angka = { 30, 22, 9, 33, 25, 55, 41, 60 };
        R7_B2_4c algoritma = new R7_B2_4c();
        int n = angka.length;
        System.out.println("Longest Increasing Subsequence : " + algoritma.lis( angka, n ) + "\n" );
    }
}
