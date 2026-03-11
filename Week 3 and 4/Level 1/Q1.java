import java.util.Scanner;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if(number % 5 == 0)
        {
            System.out.println("Divisble by 5");
        }
        else
        {
            System.out.println("not divisible by 5");
        }
    }
}