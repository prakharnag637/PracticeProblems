import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
    }
}