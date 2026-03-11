import java.util.Scanner;
class Q4 
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = input.nextLine();
        System.out.println("Please enter the Starting City");
        String fromCity = input.nextLine();
        System.out.println("Please enter the city passing through");
        String viaCity = input.nextLine();
        System.out.println("Please enter the destination city");
        String toCity = input.nextLine();
        System.out.println("Please enter the distances fromToVia in Miles");
        double distanceFromToVia = input.nextDouble();
        System.out.println("Please enter the distances viaToFinalCity in Miles");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.println("Please enter the time taken From City to Via City");
        int timeFromToVia = input.nextInt();
        System.out.println("Please enter the time taken Via City to Final Destination");
        int timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and " + "the Total Time taken is " + totalTime + " minutes");
    }
}


