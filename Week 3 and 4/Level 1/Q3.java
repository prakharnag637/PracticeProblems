import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String ifn1 = "No", ifn2 = "No", ifn3 = "No";
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        System.out.println("Enter the third number");
        int number3 = input.nextInt();
        if(number1 > number2)
        {
            if(number1 > number3)
            {
                ifn1 = "Yes";
            }
            else
            {
                ifn3 = "Yes";
            }
        }
        else
        {
            if(number2 > number3)
            {
                ifn2 = "Yes";
            }
            else
            {
                ifn3 = "Yes";
            }
        }
        System.out.println("Is the first number the largest ?? " + ifn1);
        System.out.println("Is the second number the largest ?? " + ifn2);
        System.out.println("Is the third number the largest ?? " + ifn3);
    }
}