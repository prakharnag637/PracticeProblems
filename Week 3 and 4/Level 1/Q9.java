import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int countdown = input.nextInt();
        for(int i = countdown; i > 0; i --)
        {
            System.out.println(i);
        }
    }
}