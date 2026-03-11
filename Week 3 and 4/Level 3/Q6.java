import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(), counter = 0;
        while(num > 0)
        {
            counter++;
            num /= 10;
        }
        System.out.println(counter);
    }
}