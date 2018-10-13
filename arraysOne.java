import javax.lang.model.util.ElementScanner6;

public class arraysOne{

    public void puzzle_DA1(int size, int[] arr){
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
    public void puzzle_DA2(int size, int arr[]){
        for(int i=0; i<size; i++){
            if(i%10==9)
                System.out.printf("%4d\n", arr[i]);
            else
                System.out.printf("%4d", arr[i]);
        }
    }
    public static void main(String[] args){
        int x[] = {1,  2,  3,  4,  5,  6,  7,  8,  9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,             
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        arraysOne oneD = new arraysOne();
        oneD.puzzle_DA2(40, x);
    }
}