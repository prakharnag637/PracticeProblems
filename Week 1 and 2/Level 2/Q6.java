import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        float number1 = input.nextFloat();
        System.out.println("Please input the second number: ");
        int number2 = input.nextInt();
        float quotient = number1/number2;
        float remainder = number1%number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 +" and " + number2);
    }
}
