import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amar's age : ");
        int amar = input.nextInt();
        System.out.println("Enter Akbar's age : ");
        int akbar = input.nextInt();
        System.out.println("Enter Anthony's age : ");
        int anthony = input.nextInt();
        String most, least;
        int youngest, oldest; 
        if(amar > akbar)
        {
            if(amar > anthony)
            {
                most = "Amar";
                oldest = amar;
                if(akbar > anthony)
                {
                    least = "Anthony";
                    youngest = anthony;
                }
                else
                {
                    least = "Akbar";
                    youngest = akbar;
                }
            }
            else
            {
                least = "Akbar";
                youngest = akbar;
                most = "Anthony";
                oldest = anthony;
            }
        }
        else
        {
            if(akbar > anthony)
            {
                most = "Akbar";
                oldest = akbar;
                if(amar > anthony)
                {
                    least = "Anthony";
                    youngest = anthony;
                }
                else
                {
                    least = "Amar";
                    youngest = amar;
                }
            }
            else
            {
                most = "Anthony";
                oldest = anthony;
                least = "Amar";
                youngest = amar;
            }
        }
        System.out.println(most + " is the oldest with " + oldest);
        System.out.println(least + " is the youngest with " + youngest);
    }
}