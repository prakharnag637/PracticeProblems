import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for the first subject");
        int sub1 = input.nextInt();
        System.out.println("Enter marks for the second subject");
        int sub2 = input.nextInt();
        System.out.println("Enter marks for the third subject");
        int sub3 = input.nextInt();
        float avg = (sub1 + sub2 + sub3) / 3f;
        System.out.println(avg);
        if(avg >= 80)
        {
            System.out.println("grade = A  Remarks = (Level 4, above agency-normalized standards");
        }
        else if(avg >= 70)
        {
            System.out.println("grade = B  Remarks = (Level 3, at agency-normalized standards");
        }
        else if(avg >= 60)
        {
            System.out.println("grade = C  Remarks = (Level 2, below, but approaching agency-normalized standards)");
        }
        else if(avg >= 50)
        {
            System.out.println("grade = D  Remarks = (Level 1, well below agency -normalized standards)");
        }
        else if(avg >= 50)
        {
            System.out.println("grade = E  Remarks = (Level 1-, too below agency -normalized standards)");
        }
        else
        {
            System.out.println("grade = R  Remarks = (Remedial Standards)");
        }
    }
}