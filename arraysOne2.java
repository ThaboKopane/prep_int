import java.util.Arrays;
public class arraysOne2{

    public void puzzle_DB12(int[] arr){
        int sum=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0)
                sum+=arr[i];
        }
        System.out.println("sum of odd: "+sum);
    }
    //I don't understand
    public void puzzle_DB14(double[] y_ax, double[] x_ax){
        double sum_of_square =0.0;
        if(y_ax.length == x_ax.length){

            for(int i=0; i<y_ax.length; i++){
                sum_of_square =9.8;
            }
        }else
            System.out.println("Missing values motherfucker");
    }
    public void puzzle_DB18(int[] arr){
        System.out.println("Arrays odd only; "+ Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(arr[i]< 0){
                if(arr[i]%2 !=0)
                    arr[i] = arr[i] -1;
            } else if(arr[i] >0){
                if(arr[i]%2 !=0)
                    arr[i] = arr[i]+1;
            }
        }
        System.out.println("array with only even: "+Arrays.toString(arr));
    }
    public void puzzle_DB20(int[] arr1, int[] arr2){
        //Determine if two arrays are equal
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] == arr2[i])
                    continue;
                else
                    System.out.printf("arrays not equal\n");
            }
        }else 
            System.out.printf("Arrays aren't equal\n");
    }
    public static void main(String[] args){
        arraysOne2 oneD = new arraysOne2();
        int x[] = {0,2,1,-3,-5,2,4,6,9,60};
        int y[] = {0,2,1,-3,-5,2,4,6,9,60};
        oneD.puzzle_DB20(x,y);


    }

}