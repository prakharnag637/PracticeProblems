import java.util.Scanner;
public class Q5
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
            sum += (digit * digit * digit);
            originalNumber /= 10;
        }
        if(num == sum)
        {
            System.out.println("It is an armstrong number");
        }
    }
}