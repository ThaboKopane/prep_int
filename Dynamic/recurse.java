public class recurse{

    public int loop(int n){
        if(n<=1)
            return n;
        else
            return n+loop(n-1);
    }
    public static void main(String[] args){
        recurse rec = new recurse();

        System.out.println(rec.loop(16));
    }
}