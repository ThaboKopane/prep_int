public class loops_l2{
    public void puzzle_11(int number){
        for(int i=1; i<number; i+=2){
            System.out.printf("%3d", i);
            if(i%5==4) System.out.printf("\n");
        }
    }

    //Does not produce the desired 
    public void puzzle_12(int start, int finish){
        int count=0;
        for (int i=start; i<=finish; i++){
            if(i%2 !=0){
                System.out.printf("%4d",i);
                if (i%7==6) System.out.printf("\n");
                count++;
            }
        } if (count%7 !=0) System.out.printf("\n");
    }
//Does not produce the desired results
    public void puzzle_12_1(int start, int finish){
        int count =0;
        for(int i=start; i>=finish; i--){
            if(i%2 !=0){
                System.out.printf("%4d",i);
                if(i%7==6) System.out.printf("\n");
                count++;
            }
        } if(count%7 != 0) System.out.printf("\n");
    }
    public void puzzle_13(){
        int count=0;
        for(int i=1; i<=100; i++){
            if(!(i%3 ==0)){
                System.out.printf("%3d",i);
                if(i%10==9) System.out.printf("\n");
                count++;
            }
        } if(count%10 ==0) System.out.printf("\n");
    }
    public void puzzle_14(){
        int k=0;
        int base;
        //number of lines to print
        int maxLines =11;

        for(int j=0; j<= maxLines*100+99; j+=23){
            base =j/100;

            if(base==k+1){
                System.out.printf("\n%5d", j);
                k++;
            } else{
                System.out.printf("%5d",j);
            } System.out.printf("\n");
        }

    }
    public void puzzle_16(){
        int n=7, m=21;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
    public void puzzle_17(){
        int line, col;
        int n=15;

        for (col=0; col<n; col++){
            for(line=0; line<col; line++)
                System.out.printf("R");
            System.out.printf("*\n");
        }

    }

    public void puzzle_18(){
        int row, col;
        int n=15;

        for(row=0; row<n; row++){
            for (col=n; col>=row; col--)
                System.out.printf(".");
            System.out.printf("*\n");
        }
    }
    public void puzzle_18_1(){
        int row, col;
        int n=15;
        for(row=0; row<n; row++){
            for(col=0; col<n-row; col++)
                System.out.printf(".");
            System.out.printf("*\n");
        }
    }
    public void puzzle_19(){
        int row, col;
        int n=15;
        for(row=0; row<n; row++){
            for(col=0; col<row; col++)
                System.out.printf(" ");
            //This for loop continues where the previous
            //for loop left off.
            for(; col<n; col++)
                System.out.printf("*");
            System.out.printf("\n");

        }
    }
    public void puzzle_19_1(){
        int row, col;
        int n=15;
        for(row=0; row<n; row++){
            for(col=0; col<row; col++)
                System.out.printf("*");
            for(; col<n; col++)
                System.out.printf(" ");
            System.out.printf("\n");
        }
    }

    public void puzzle_20(){
        int row, col;
        int n=15;
        for(row=0; row<n; row++){
            int stars = 2*row+1;
            //int spaces = (2*n-1-stars)/2;

            for(col=n; col>=row; col--)
                System.out.printf(".");
            for(int i=0; i<=stars; i++)
                System.out.printf("*");
            for(; col<n; col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
    }
    public void rand(){
        int row, col;
        int n=15;

        for(row=0; row<n; row++){
            int stars = 2*row+1;
            for (col=0; col<stars; col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
    public static void main(String[] args){
        loops_l2 lup = new loops_l2();
        System.out.println("wait");
        lup.puzzle_20();
    }
}