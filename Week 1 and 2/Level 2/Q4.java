import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the distance in feet: ");
        float distanceInFeet = input.nextFloat();
        float distanceInYard = distanceInFeet/3;
        float distanceInMile = distanceInYard/1760;
        System.out.println("The distance in yards is " + distanceInYard + " while the distance in miles is " + distanceInMile);
    }
}
