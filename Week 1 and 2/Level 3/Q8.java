import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principal");
        int principal = input.nextInt();
        System.out.println("Please enter the rate");
        float rate = input.nextFloat();
        System.out.println("Please enter the time");
        int time = input.nextInt();
        float SimpleInterest = principal * rate * time / 100f;
        System.out.println("The Simple Interest is " + SimpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time" + time);
    }
}