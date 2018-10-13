public class coefficients{

    public int binCoeff(int N, int k){
        //int last = 1;
        if(k==0 || k==N)
            return 1;
        else{
            return binCoeff(N-1,k-1)+binCoeff(N-1, k);
        }
        //return last;
        
    }

    public static void main(String[] args){
        coefficients binCo = new coefficients();

        System.out.println(binCo.binCoeff(100, 10));
    }
}