import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.println("Enter the Second number : ");
        int number2 = input.nextInt();
        int blah = number1;
        number1 = number2;
        number2 = blah;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}