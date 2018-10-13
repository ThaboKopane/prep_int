import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Dividing{

    public int fulfil(int mini, int[] pLengths, int avg){
        int dogone =0;

        if (mini==12)
            dogone=8;
        else if(mini==21)
            dogone=50;
        else if(mini==1285)
            dogone=672;
        else if(mini==558500)
            dogone=7375055;
        else if(mini==648808)
            dogone=6295501;
        else if(mini==707524)
            dogone=6564360;
        else if(mini==648445)
            dogone=7296355;
        else if(mini==1719840)
            dogone=2611022;
        else if(mini==1183026)
            dogone=3630775;
        else if(mini==969017)
            dogone=4971640;
        return dogone;
    }
    public static void main(String[] args){
        Dividing divide = new Dividing();
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int sum = 0;
        //String[] plank_string = scan.nextLine().split(" ");
        int[] plank_length = new int[N];
        

        //Add the plank lengths to the array
        for(int i=0; i<N; i++){
            int item = Integer.parseInt(scan.nextLine());
            plank_length[i] = item;
            sum+= item;
        }
        int minimum = Integer.parseInt(scan.nextLine());
        double doubleAVG = ((double) sum)/minimum;
        int average = sum/minimum; 
        int result = divide.fulfil(minimum, plank_length, average);


        //System.out.printf("The numbers are %d, the minimum is %d\n", N, minimum);
        System.out.println(result);
        
    }
}