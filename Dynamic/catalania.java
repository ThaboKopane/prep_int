import java.util.Arrays;

public class catalania{

    public long catalanD(int n){
        if(n <= 1)
            return 1;
        long[] catalan = new long[n+1];
        catalan[0] = 1;
        catalan[1] = 1;

        for(int i=2; i<n; i++){
            catalan[i] = 0;
            for(int j=0;j<i;j++)
                catalan[i] += catalan[j]*catalan[i-j-1];
        }
        return catalan[n];
    }
    public static void main(String[] args){
        catalania cat = new catalania();

       for(int n=0; n<10; n++)
            System.out.println(cat.catalanD(n));

    }
}