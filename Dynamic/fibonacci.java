import java.math.BigInteger;
import java.util.Arrays;
public class fibonacci{

    public int recurse(int n){
        if (n<=1) return n;
        return recurse(n-1) + recurse(n-2);
    }

    public int[] dynamic(int n){
        int[] dynamicArr = new int[n+1];

        dynamicArr[0] = 0;
        dynamicArr[1]=1;

        for(int i=2; i<=n; i++)
            dynamicArr[i] = dynamicArr[i-1]+dynamicArr[i-2];

        return dynamicArr;
    }

    public BigInteger bigway(int n){
        if(n==0) return new BigInteger("0"); if (n==1) return new BigInteger("1");
        BigInteger[] table = new BigInteger[3];
        table[0] = new BigInteger("0");
        table[1] = new BigInteger("1");

        for(int i=2; i<n; i++){
            table[2] = table[1].add(table[0]);
            table[0] = table[1];
            table[1] = table[2];
        }

        return table[2];
    }
    public static void main(String[] args){
        fibonacci fib = new fibonacci();

        long startTime = System.nanoTime();
        System.out.println(fib.recurse(40));
        long endTime = System.nanoTime();

        long dynT = System.nanoTime();
        int result[] = fib.dynamic(40);
        //System.out.println(Arrays.toString(fib.dynamic(40)));
        System.out.println(result[result.length-1]);
        long endDyN = System.nanoTime();

        System.out.println("recursive: "+(endTime - startTime)+" dynamic time: "+(endDyN-dynT));
        
    }
}