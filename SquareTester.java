class SquareCalc{

    public int Square(int N){
        if(N==1)
            return 1;
        else
            return Square(N-1) +2*N-1;
    }

    public void square(int n){
        int col, row;

        for(row=0; row<n; row++ ){
            for(col=0; col<n; col++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}

public class SquareTester{
    public static void main(String[] args){
        SquareCalc sqc = new SquareCalc();
        int result = sqc.Square(4);

        System.out.printf("The result is %d\n", result);
        sqc.square(4);

    }
}