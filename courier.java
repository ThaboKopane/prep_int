//This class is not complete
public class courier{

    private float[] parcels;

    public courier(float[] parcels){
        this.parcels = parcels;
    }

    public Float weight(float part){

        if(part<1)
            return 2.00f;
        else
            return 2*part;
    }

public static void main(String[] args){
    float[] parcelsToBe = {0.8f, 3.16f, 2.04f, 1.5f, 5.3f};
    System.out.println(parcelsToBe);

    courier deliveries = new courier(parcelsToBe);
}
}