import java.util.Arrays;
import java.util.Scanner;

public class Path{

    public int Pathing(int x, int y,int obs, int[][] obstacles){
        
        /*if(n==0) return 0;
        else if(n==obs) return 0;
        else{
            return 
        } */
        return 0;      
    }
    public static void main(String[] args){
        Path tsela = new Path();
        Scanner scan = new Scanner(System.in);

        int N= Integer.parseInt(scan.nextLine());
        int m = Integer.valueOf(N);
        int nObz = Integer.parseInt(scan.nextLine());
        int[][] locations = new int[nObz][2];

        for(int i=0; i<nObz; i++){
            String[] arr = scan.nextLine().split(" ");

            locations[i] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        }


        System.out.println(m+" "+nObz+" "+tsela.Pathing(N, m, nObz, locations));

    }
} 