public class Q6
{
    public static void main(String[] args)
    {
        int fee = 125000;
        int discount = fee * 10/100;
        int discountedPrice = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted price is INR " + discountedPrice);
    }
}