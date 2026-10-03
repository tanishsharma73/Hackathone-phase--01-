import java.util.Scanner;

class Wastecollection {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        int vehicleNumber = scanner.nextInt();
        System.out.print("Enter waste collected (in kg): ");

        double wasteCollectedKg = scanner.nextDouble();
        System.out.print("Enter number of collection points: ");
        int collectionPoints = scanner.nextInt();
        System.out.print("Enter vehicle status (A/R): ");
        char vehicleStatus = scanner.next().charAt(0);  
        System.out.println("Vehicle number: " + vehicleNumber);
        System.out.println("Waste collected (kg): " + wasteCollectedKg);
        System.out.println("Number of collection points: " + collectionPoints);
        System.out.println("Vehicle status: " + vehicleStatus);
    }
}