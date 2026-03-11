import java.util.Scanner;
public class Q12 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number (n): ");
        int n = input.nextInt();
        int i = 1;
        int sumWhile = 0;
        while (i <= n) 
        {
            sumWhile = sumWhile + i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
        
    }
}