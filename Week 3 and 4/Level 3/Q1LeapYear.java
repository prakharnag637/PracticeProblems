import java.util.Scanner;
public class Q1LeapYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        boolean isLeapYear = false;
        if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if((year % 4 == 0) && (year % 100 != 0))
        {
            isLeapYear = true;
        }
        if(isLeapYear)
        {
            System.out.println("The entered year is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}