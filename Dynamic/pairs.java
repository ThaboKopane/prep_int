import java.util.Arrays;
public class pairs{

    public static int count(int n){
        int dp[] = new int[n+1];
        for(int i=0; i<=n; i++){
            if(i<=2)
                dp[i] =i;
            else
                dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }

    return dp[n];
    }
    public static void main(String[] args){
        pairs single = new pairs();

        System.out.println(single.count(4));

         
    }
}