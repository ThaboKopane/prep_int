import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class Diagonal{

    public int diag(int[][] x){
        int right =0;
        int left =0;

        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                if(i==j)
                    right+=x[i][j];
                if(i == x.length - j -1)
                    left+=x[i][j];
            }
        }


        return Math.abs(right-left);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Diagonal mat = new Diagonal();

        int diff[][] = {{2,5,6}, {3,2,7},{9,5,6}};

        int result = mat.diag(diff);

        System.out.printf("The difference is %d\n", result);
    }
}