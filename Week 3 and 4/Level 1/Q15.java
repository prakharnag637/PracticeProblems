import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = input.nextInt();
        long factorial = 1;
        for(int i = 1;i <= number; i++) 
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }    
}
