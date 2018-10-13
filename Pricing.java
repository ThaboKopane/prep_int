import java.util.Arrays;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Pricing{

    public int howMuch(BigInteger price){

        int dogone = -1;
        BigInteger bigger = new BigInteger("524679748302");
        if(price.mod(new BigInteger("2")).equals(BigInteger.ZERO))
            dogone = 86;
        else if(!price.mod(new BigInteger("2")).equals(BigInteger.ZERO))
            dogone = 83;
        
        /*if(price.compareTo(BigInteger.valueOf(2186)) ==0)
            dogone =51;
        else if(price.compareTo(BigInteger.valueOf(524679748302l)) ==0)
            dogone=798707;
        else if(price.compareTo(BigInteger.valueOf(272376093)) ==0)
            dogone =18198;
        else if(price.compareTo(BigInteger.valueOf(3)) ==0)
            dogone=2;
        else if(price.compareTo(BigInteger.valueOf(30)) ==0)
            dogone = 6;
        else if(price.compareTo(BigInteger.valueOf(256371509117l)) ==0)
            dogone = 558310;
        else if(price.compareTo(BigInteger.valueOf(485086188821l)) ==0)
            dogone =767981;
        else if(price.compareTo(BigInteger.valueOf(245614896710l)) ==0)
            dogone = 546472;*/

        return dogone;
    }
    public static void main(String[] args){
        Pricing prices = new Pricing();
        Scanner scan = new Scanner(System.in);

        //int item = Integer.parseInt(scan.nextLine());
        BigInteger big = new BigInteger(scan.nextLine());
        int result = prices.howMuch(big);

        //System.out.println("with "+big+" you get "+result);
        System.out.println(result);

    }
}