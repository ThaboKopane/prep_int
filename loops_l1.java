import java.util.Scanner;
public class loops_l1{

    public void puzzle_l1(){
        for (int i=0; i<15; i++){
            System.out.printf("%3d\n",i);
        }
    }
    public void puzzle_l3(){
        for(int i=0; i<21; i+=2){
            System.out.printf("%3d\n",i);
        }
    }
    public void puzzle_l4(){
        for(int i=-7;i<=7;i++){
            System.out.printf("%3d\n",i);
        }
    }
    public void puzzle_l7(){
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i=1; i<number; i+=2){
            System.out.printf("%2d\n", i);
        }
    }
    public void puzzle_l8(){
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int all =0;
        int odd=0;
        int even=0;
        for (int i=0; i<=number; i++){
            all+=i;
            if(i%2==0)
                even+=i;
            else if(i%2!=0)
                odd+=i;
        }
        System.out.println("odd: "+odd+", even: "+even+", all: "+all);
    }
    public void puzzle_l9(){
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int all =0;
        int odd=0;
        int even=0;
        for (int i=0; i<=number; i++){
            if(i%4!=0 || i%3!=0){
                all+=i;
                if(i%2==0)
                    even+=i;
                else if(i%2!=0)
                    odd+=i;
            }
        }
        System.out.println("odd: "+odd+", even: "+even+", all: "+all);
    }
    public void puzzle_l10(){
        for(int i=0; i<=24; i++){
            System.out.printf("%3d", i);
            if (i%5==4) System.out.printf("\n");
        }
    }
    public static void main(String[] args){
        System.out.println("wait");
        loops_l1 inst = new loops_l1();

        inst.puzzle_l8();
        
    }
}