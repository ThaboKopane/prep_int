public class loops_l3{

    public void puzzle_21(){
        int row, col, stars;
        int n=10;
        

        for(row=0; row<n; row++){
            stars = 2*row+1;
            for(col=n; col>=row;col--)
                System.out.printf(" ");
            for(int i=0; i<stars; i++)
                System.out.printf("*");
            for(; col<n; col++)
                System.out.printf(" ");
            System.out.printf("\n");
        }
        //Now for the stem
        stars = 2*(n/8)+1; //what does this do?
        int spaces = (2*n-1-stars)/2; //What does this do
        for(row=0; row<n/3; row++){
            for(col=0;col<spaces;col++)
                System.out.printf(".");
            for(col=0; col<stars; col++)
                System.out.printf("*");
            for(; col<spaces; col++)
                System.out.printf(".");
            System.out.printf("\n");  
        }
        //System.out.printf("\n");

        
    }

    public void puzzle_22(){
        int n=5, m=11;
        int row, col;

        for (row=0; row<n/2+1; row++){
            for (col=0; col<m;col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
        for(row=0; row<10/2; row++){
            for(col=0; col<6/2; col++)
                System.out.printf(".");
            for(; col<8; col++)
                System.out.printf("*");
            for(; col<11; col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
        for(row=0;row<n/2+1; row++){
            for(col=0; col<m; col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
    }
    public void puzzle_25(){
        int row, col;
        int n=24;

        for(row=0; row<n/6; row++){
            for(col=0; col<n; col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        for(row=0; row<n/6;row++){
            for(col=0; col<n; col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
        for(row=0; row<n/6;row++){
            for(col=0;col<n;col++)
                System.out.printf("O");
            System.out.printf("\n");
        }
        for(row=0; row<n/6;row++){
            for(col=0;col<n;col++)
                System.out.printf("+");
            System.out.printf("\n");
        }
        for(row=0;row<n/6;row++){
            for(col=0;col<n;col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        for(row=0;row<n/6;row++){
            for(col=0;col<n;col++)
                System.out.printf(".");
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    public void puzzle_26(){
        int row, col;
        int n=15;

        for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                if((row+col)%2==0)
                    System.out.printf("*");
                else
                    System.out.printf(".");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public void puzzle_27(){
        
    }
    public static void main(String[] args){
        loops_l3 lup = new loops_l3();
        lup.puzzle_26();
    }
}