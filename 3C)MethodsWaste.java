import java.util.Scanner;

class MethodsWaste {

    // Method to calculate total waste collected from two points
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading waste collected at point 1
        System.out.print("Enter waste collected at collection point 1 (in kg): ");
        double point1Waste = scanner.nextDouble();

        // Reading waste collected at point 2
        System.out.print("Enter waste collected at collection point 2 (in kg): ");
        double point2Waste = scanner.nextDouble();

        // Calling the method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Displaying the total waste
        System.out.println("Total waste collected: " + totalWaste + " kg");

        scanner.close();
    }
}