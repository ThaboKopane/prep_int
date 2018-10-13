import java.util.Arrays;

public class arrEx67{
    public void ex1(int[][] arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            int row_sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
                row_sum =0;

            }
        }

        System.out.printf("The sum is %d", sum);
    }
    public static void main(String[] args){

        int data[][] = {{3,2,4},
                        {1,4,4,8,13},
                        {9,1,0,2},
                        {0,2,6,3,-1,-8}};
        
        arrEx67 twoD = new arrEx67();
        twoD.ex1(data);
        
    }
}