import java.util.Arrays;

public class arraysTwo{
    public static void main(String[] args){

        int myArray[][] = {{1,2,3,4}, {5,6,7,8}, {9,-2,9,23}};

        int sum =0;
        int max =0;
        for(int i=0; i<myArray.length; i++){
            System.out.println(Arrays.toString(myArray[i]));
            for(int j=0; j<myArray[i].length; j++){
                sum+=myArray[i][j];
                if(myArray[i][j] > max)
                    max = myArray[i][j];
            }
        }
        System.out.printf("The sum is %d and the max is %d\n",sum,max);
    }
}