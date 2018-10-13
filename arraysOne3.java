import java.util.Arrays;


public class arraysOne3{
    public void puzzle_DC21(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.printf("The max is %d\n",max);
    }
    //linear search
    public void puzzle_DC23(int[] arr, int search){
        int search_index =-1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == search)
                search_index = i;
        }

        if(search_index == -1)
            System.out.printf("Element %d not found", search);
        else
            System.out.printf("Element %d found at index %d",search, search_index);
    }
    //first occurence
    public int puzzle_DC24(int[] arr, int search){
        int occurence = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search)
                return i;
        }
        return occurence;
    }
    //looking for a sequence
    public void puzzle_DC26(int[] arr, int x, int y){
        int found =-1;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x && arr[i+1] == y)
                found = i;
        }
        if(found == -1)
            System.out.println("Sequence not found");
        else
            System.out.printf("%d, %d found at index %d",x,y,found);
    }
    public void puzzle_DC30(int[] arr, int position, int item){
        int[] nuar = new int[arr.length+1];
        for(int i=0; i<position; i++)
            nuar[i] = arr[i];
        nuar[position] = item;
        for(int j=position+1; j<nuar.length;j++)
            nuar[j] = arr[j-1];

        System.out.println("The old array: "+Arrays.toString(arr));
        System.out.println("The new array: "+Arrays.toString(nuar));

    }
    public static void main(String[] args){
        arraysOne3 oneD = new arraysOne3();
        int x[] = {19,51,58,47,30,27,58,87,32,52,
                    17,28,78,32,63,9,50,62,38,65,
                    91,41,17,14,85,41,63,79,69,83};
        int them[] = {0,1,2,3,4,5,6,7,8,9};
        oneD.puzzle_DC30(them, 4, 30);
        //System.out.println(oneD.puzzle_DC24(x, 78));
    }
}