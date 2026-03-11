import java.util.Scanner;
public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Chocolates");
        int numberOfChocoloates = input.nextInt();
        System.out.println("Number of Children");
        int numberOfChildren = input.nextInt();
        int div = numberOfChocoloates / numberOfChildren;
        int remaining = numberOfChocoloates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + div + " and the number of remaining chocolates are " + remaining);
    }
}