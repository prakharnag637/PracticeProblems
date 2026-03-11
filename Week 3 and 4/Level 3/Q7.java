import java.util.Scanner;
public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double weight = input.nextDouble();
        System.out.println("Enter height in cm");
        double height = input.nextDouble();
        double bmi = (weight * 10000) /(height*height);
        if(bmi >= 40)
        {
            System.out.println("Obese");
        }
        else if(bmi >= 25)
        {
            System.out.println("Overweight");
        }
        else if(bmi >= 18.5)
        {
            System.out.println("Normal");
        }
        else
        {
            System.out.println("UnderWeight");
        }
    }
}