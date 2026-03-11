import java.util.Scanner;
public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        float wtInPound = input.nextFloat();
        float wtInKg = wtInPound * 2.2f;
        System.out.println("The weight of the person in pounds is " + wtInPound + " and in kg is" + wtInKg);
    }
}