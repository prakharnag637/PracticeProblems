import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee's salary:");
        double salary = input.nextDouble();
        System.out.println("Enter the years of service:");
        int years = input.nextInt();
        double bonus = 0.0;
        if (years > 5) 
        {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount: " + bonus);
    }
}