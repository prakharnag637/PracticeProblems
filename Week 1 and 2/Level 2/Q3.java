import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length of the square: ");
        float side = input.nextFloat();
        float perimeter = 4 * side;
        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);
    }
}
