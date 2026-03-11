import java.util.Scanner;
public class Q13
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number (n): ");
        int n = input.nextInt();
        int sumWhile = 0;
        for(int i = 1; i <= n; i++) 
        {
            sumWhile = sumWhile + i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
        
    }
}