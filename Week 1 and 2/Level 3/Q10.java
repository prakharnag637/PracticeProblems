import java.util.Scanner;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int students = input.nextInt();
        int handshakes = ((students - 1) * students) / 2;
        System.out.println("The maximum number of handshakes possible are - " + handshakes);
    }
}