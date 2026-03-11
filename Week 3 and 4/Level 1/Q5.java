import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        boolean votable = false;
        if( age >= 18)
        {
            votable = true;
        }
        if(votable)
        {
            System.out.println("The person's age is " + age + " and can vote");
        }
        else
        {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
    }
}