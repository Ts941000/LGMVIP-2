import java.util.Scanner;

public class LGMVIP2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter amount in USD:");
        double usdAmount = scanner.nextDouble();

        System.out.println("Enter the conversion rate (1 USD to X currency):");
        double conversionRate = scanner.nextDouble();

        double convertedAmount = usdAmount * conversionRate;

        System.out.println("Converted amount: " + convertedAmount);
        
        scanner.close();
    }
}

