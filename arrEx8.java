import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class arrEx8{
    public static void main(String[] args){

        
        try{
            Scanner scan = new Scanner(new File("CoffeData.txt"));
            int number = Integer.parseInt(scan.nextLine());
            double[] items = new double[number];
            double sum=0.0;
            for(int i=0; i<number; i++){
                double item = Double.parseDouble(scan.nextLine());
                items[i] = item;
                sum +=item;
            }
            double average = (double)sum/number;
            double[] dist = new double[number];
            double max_dist =0.0;
            int positions=-1;
            for(int i=0; i<number; i++){
                double distance = Math.sqrt(Math.pow((average-items[i]), 2));
                dist[i] = distance;
                if(distance >max_dist){
                    max_dist = distance;
                    positions = i;
                }
            }
            System.out.println("The average is "+ (double)sum/number);
            double nuaverage = (double)(sum-items[positions])/(number-1);
            System.out.println("The new avergae is "+ nuaverage);

        }catch(FileNotFoundException e){e.printStackTrace();}


        
    }
}