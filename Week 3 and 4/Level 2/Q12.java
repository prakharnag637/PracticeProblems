import java.util.Scanner;
public class Q12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Enter a power");
        int power = input.nextInt();
        if(power > 0)
        {
            int res = 1;
            for(int i = 1; i <= power; i++)
            {
                res *= num;
            }
            System.out.println(res);
        }
        else
        {
            System.out.println("Please enter a positive value");
        }
    }
}