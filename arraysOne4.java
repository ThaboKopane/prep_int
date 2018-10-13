import java.util.Arrays;

public class arraysOne4{

    public void puzzle_DD31(int[] arr){
        System.out.println("The old array: "+Arrays.toString(arr));

        for(int i=0; i<arr.length/2; i++){
            int temp =arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println("The new array: "+Arrays.toString(arr));
            
    }
    public void puzzle_DD34(int[] arr){
        System.out.println("The unshifted array: "+Arrays.toString(arr));

        int[] shifted = new int[arr.length];
        for(int i=1; i<arr.length; i++){
            shifted[i] = arr[i-1];
        } 
        shifted[0] = arr[arr.length-1];

        System.out.println("The shifted array: "+Arrays.toString(shifted));
    }
    public static void main(String[] args){
        arraysOne4 oneD = new arraysOne4();

        int x[] = {0,1,2,3,4,5,6,7,8,9,10};
        oneD.puzzle_DD34(x);
    }
}