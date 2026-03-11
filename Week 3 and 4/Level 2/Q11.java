import java.util.Scanner;
public class Q11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for(int i = 1; i < 100; i++)
        {
            if( i % num  != 0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}