import java.util.Scanner;
public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the fee : ");
        int fee = input.nextInt();
        System.out.println("Please enter the Discount Percent : ");
        int discountPercent = input.nextInt();
        int discount = fee * discountPercent/100;
        int discountedPrice = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted price is INR " + discountedPrice);
    }
}