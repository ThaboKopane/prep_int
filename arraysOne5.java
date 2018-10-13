import java.util.Arrays;
//Incomplete
public class arraysOne5{
    public void puzzleDE41(int[] arr){
        int[] swapped = new int[arr.length];
        int arrlength = arr.length;

        for(int i=0; i<arrlength/2; i++)
            swapped[i] = arr[arrlength-i-1];
        for(int j=arrlength/2+1; j<arrlength; j++)
            swapped[j] =arr[arrlength-j-1];

        System.out.println("old: "+Arrays.toString(arr));
        System.out.println("new: "+Arrays.toString(swapped));
    }
    public static void main(String[] args){
        arraysOne5 oneD = new arraysOne5();
        int x[] = {1,2,3,4,5,6,7,8,9};

        oneD.puzzleDE41(x);

    }
}