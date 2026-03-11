import java.util.Scanner;
public class Q13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(), i = 1;
        while (i < 100)
        {
            if( i % num  == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}