import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gasInTank = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        double costPerHundMiles; // cost of gas for the car per 100 miles
        double distanceOnTank; // How far the car can go on it's current tank of gas.

        System.out.println("Enter how many gallons of gas in your tank: ");
        if(sc.hasNextDouble()){
            gasInTank = sc.nextDouble();
        }else{
            System.out.println("Invalid Input. Please run again with valid input.");
            System.exit(0);
        }

        System.out.println("Enter your vehicle's fuel efficiency in mpg: ");
        if(sc.hasNextDouble()){
            fuelEff = sc.nextDouble();
        }else{
            System.out.println("Invalid Input. Please run again with valid input.");
            System.exit(0);
        }

        System.out.println("Enter current gas prices: ");
        if(sc.hasNextDouble()){
            gasPrice = sc.nextDouble();
        }else{
            System.out.println("Invalid Input. Please run again with valid input.");
            System.exit(0);
        }

        costPerHundMiles = (100.00/fuelEff) * gasPrice;
        System.out.println("The cost per 100 miles you drive is $" + costPerHundMiles);
        distanceOnTank = fuelEff*gasInTank;
        System.out.println("You could make it " + distanceOnTank + "mi on your current tank of gas.");
    }
}
