import java.util.Arrays;
import java.util.Scanner;

public class Path{

    public int Path(int grid, int obs, int[][] obstacles){
        int what = -1;
        int[] subproblems = new int[grid];
        if(grid <= 2 && obs>0)
            what = 0;
        else if(grid<=2)
            what = grid;
        else{
            what = grid;
        }
        

        return what;
       
    }
    public static void main(String[] args){
        Path tsela = new Path();
        Scanner scan = new Scanner(System.in);

        int N= Integer.parseInt(scan.nextLine());
        int nObz = Integer.parseInt(scan.nextLine());
        int[][] locations = new int[nObz][2];

        for(int i=0; i<nObz; i++){
            String[] arr = scan.nextLine().split(" ");

            locations[i] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(Arrays.deepToString(locations));

    }
} 