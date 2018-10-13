import java.util.Arrays;

public class coin{

    public static int count(int s[], int n){
        int m = s.length;
        int table[] = new int[n+1];
        table[0] = 1;

        for(int i=0; i<m; i++)
            for(int j=s[i];j<=n;j++)
                table[j] += table[j-s[i]];

        return table[n];
    }
    public static void main(String[] args){
        coin change = new coin();
        
        int si[] = {1,2,3};


    System.out.println(change.count(si,4));
    }
}