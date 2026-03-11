import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        System.out.println("Enter the third number");
        int number3 = input.nextInt();
        if(number1 < number2)
        {
            if(number1 < number3)
            {
                System.out.println(number1 + " is the smallest number");
            }
            else
            {
                System.out.println(number3 + " is the smallest number");
            }
        }
        else
        {
            if(number2 < number3)
            {
                System.out.println(number2 + " is the smallest number");
            }
            else
            {
                System.out.println(number3 + " is the smallest number");
            }
        }
    }
}