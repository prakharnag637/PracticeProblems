import java.util.Scanner;
public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum > num)
        {
            System.out.println("You have entered an abundant number");
        }
        else
        {
            System.out.println("you have not entered a abundant number");
        }
    }
}