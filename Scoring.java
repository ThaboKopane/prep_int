import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Scoring{

    public void sample_out(Integer[] items, int target){

        int start = 1;
        List<Integer> lists = Arrays.asList(items);

        System.out.println(Arrays.toString(lists.toArray()));
    }
    public static void main(String[] args){
        Scoring scores = new Scoring();
        Scanner scan = new Scanner(System.in);
        int numbers = Integer.parseInt(scan.nextLine());
        Integer values[] = new Integer[numbers];

        for(int i=0; i<numbers; i++){
            values[i] = Integer.parseInt(scan.nextLine());
        }

        int Target = Integer.parseInt(scan.nextLine());

        scores.sample_out(values, Target);
    }
}