import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0, originalNumber = num;
        while(originalNumber > 0)
        {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }
        if(num % sum == 0)
        {
            System.out.println("It is a Harshad's number");
        }
        else
        {
            System.out.println("Not a Harshad's number");
        }
    }
}