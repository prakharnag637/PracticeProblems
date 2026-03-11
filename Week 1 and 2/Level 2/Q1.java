import java.util.Scanner;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number : ");
        float number1 = input.nextFloat();
        System.out.println("Please input the Second number : ");
        float number2 = input.nextFloat();
        float add = number1 + number2;
        float sub = number1 - number2;
        float mult = number1 * number2;
        float div = number1 / number2;
        System.out.println(" The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mult + ", and " + div);
    }
}
