import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of side 1");
        float side1 = input.nextFloat();
        System.out.println("Enter the length of side 2");
        float side2 = input.nextFloat();
        System.out.println("Enter the length of side 3");
        float side3 = input.nextFloat();
        float perimeter = side1 + side2 + side3;
        float rounds = 5000f/perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}