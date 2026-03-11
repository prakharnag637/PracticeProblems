import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int number = input.nextInt();
        int sum = number * (number + 1) / 2;
        System.out.println("The sum of number is " + sum);
    }
}