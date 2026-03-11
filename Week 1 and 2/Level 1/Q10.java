import java.util.Scanner;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in cm : ");
        float cm = input.nextFloat();
        float inches = cm / 2.54f;
        float feet = inches / 12f;
        System.out.println("Your Height in cm is " + cm + " While in feet is " + feet + " and inches is " + inches);
    }
}