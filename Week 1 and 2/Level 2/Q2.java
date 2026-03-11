import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the base length in cm: ");
        float baseInCm = input.nextFloat();
        System.out.println("Please input the height length in cm : ");
        float heightInCm = input.nextFloat();
        float areaCm = 1f / 2f * baseInCm * heightInCm;
        float areaInch = areaCm / (2.54f * 2.54f);
        System.out.println(" The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }
}
