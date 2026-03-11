import java.util.Scanner;
public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int greatestFactor = 0;
        for(int i = 1; i < number; i ++)
        {
            if(number % i == 0)
            {
                greatestFactor = i;
            }
        }
        System.out.println("The Greatest factor = " + greatestFactor);
    }
}