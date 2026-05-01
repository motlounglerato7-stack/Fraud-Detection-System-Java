import java.util.Scanner;

public class FraudDetectionSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double amount;
        String location;
        String usualLocation;

        System.out.println("=== Smart Fraud Detection Simulator ===");

        System.out.print("Enter transaction amount: R");
        amount = input.nextDouble();

        input.nextLine();

        System.out.print("Enter your usual location: ");
        usualLocation = input.nextLine();
		
		System.out.print("Enter transaction location: ");
        location = input.nextLine();

        System.out.println("\n--- Transaction Result ---");
		
		System.out.println("Transaction Amount: R" + amount);
		System.out.println("Location: " + location);
		

        if (amount > 10000 && !location.equalsIgnoreCase(usualLocation)) {
            System.out.println("Status: FRAUDULENT");
            System.out.println("Reason: High amount and unusual location.");
        } 
        else if (amount > 10000) {
            System.out.println("Status: SUSPICIOUS");
            System.out.println("Reason: Transaction amount is very high.");
        } 
		else if (amount => 5000 && amount <= 10000) {
            System.out.println("Status: MODERATE RISK");
            System.out.println("Reason: Transaction amount is moderate.");
		}
        else if (!location.equalsIgnoreCase(usualLocation)) {
            System.out.println("Status: SUSPICIOUS");
            System.out.println("Reason: Transaction made from unusual location.");
        } 
        else {
            System.out.println("Status: NORMAL");
            System.out.println("Reason: Transaction looks safe.");
        }

        input.close();
    }
}