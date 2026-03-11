import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = input.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= number) 
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }    
}
