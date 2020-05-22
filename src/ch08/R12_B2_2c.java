package ch08;

public class R12_B2_2c{
    static int NO = 256;
    static int max (int a, int b) { return (a > b)? a: b; }
    static void badCharHeuristic( char[] str, int size,int[] badchar){
        int i;
        for (i = 0; i < NO; i++)
            badchar[i] = -1;

        for (i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

    static void search( char[] txt, char[] pat){
        int m = pat.length;
        int n = txt.length;

        int[] badchar = new int[NO];
        badCharHeuristic(pat, m, badchar);

        int s = 0;
        while(s <= (n - m)){
            int j = m-1;
            while(j >= 0 && pat[j] == txt[s+j])
                j--;
            if (j < 0){
                System.out.println(" Pola Terjadi di : " + s);
                s += (s+m < n)? m-badchar[txt[s+m]] : 1;
            }
            else
                s += max(1, j - badchar[txt[s+j]]);
        }
    }
    public static void main(String []args) {
        System.out.println("Algoritma Boyer - Moore String Search \n");
       
        char[] txt= "BCDAABCDABCDDBCDA".toCharArray();
        char[] pat = "ABCD".toCharArray();
        search(txt, pat);
    }
}
