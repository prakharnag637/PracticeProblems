import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        if(num < 0)
        {
            System.out.println("Negative");
        }
        else if(num > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("zero");
        }
    }
}