public class Q7
{
    public static void main(String[] args)
    {
        float radiusInKm = 6378f;
        float pi = 22/7f;
        double volInKm = 4f/3f * pi * radiusInKm * radiusInKm * radiusInKm;
        float radiusInMiles = radiusInKm / 1.6f;
        double volInMiles = 4f/3f * pi * radiusInMiles * radiusInMiles * radiusInMiles;
        System.out.println("The volume of earth in cubic kilometers is " + volInKm + " and cubic miles is " + volInMiles);
    }
}