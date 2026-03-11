import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the unit price: ");
        float unitPrice = input.nextFloat();
        System.out.println("Please input the quantity: ");
        int quantity = input.nextInt();
        float total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
