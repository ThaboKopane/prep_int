import java.util.Arrays;
import java.util.Scanner;

public class subsetsum{

    public static boolean issub(int set[], int n, int sum){
        boolean subset[][] = new boolean[sum+1][n+1];

        for(int i=0; i<=n; i++)
            subset[0][i] = true;
        for(int j=0; j<=sum;j++)
            subset[i][0] = false;

        for(int i=0; i<=sum; i++){
            for (int j=1; j<=n; j++){
                subset[i][j] = subset[i][j-1];
                if(i>= set[j-1]) 
                    subset[i][j] = subset[i][j] || subset[i - set[j-1]][j-1];
            }
        }

        return subset[sum][n];
    }
    public static void main(String[] args){
        subsetsum sumset = new subsetsum();
    }
}