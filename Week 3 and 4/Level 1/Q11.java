import java.util.Scanner;
public class Q11 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter a number :");
        number = input.nextDouble();
        while (number > 0) {
            total = total + number;
            System.out.println("Enter another number:");
            number = input.nextDouble();
        }
        System.out.println("Total sum is: " + total);
    }
}