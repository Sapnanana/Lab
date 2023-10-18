import java.math.BigDecimal;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the initial net cost from the user
        System.out.print("Enter the net cost of the product: ");
        BigDecimal netCost = scanner.nextBigDecimal();

        // Define VAT percentage
        BigDecimal vatPercentage = new BigDecimal("0.23");

        // Calculating the gross value
        BigDecimal grossValue = netCost.multiply(BigDecimal.ONE.add(vatPercentage));

        // Calculating the net value after selling 10,000 pieces
        BigDecimal soldQuantity = new BigDecimal("10000");
        BigDecimal netValueAfterSale = grossValue.multiply(soldQuantity);

        // Printing the results
        System.out.println("Initial net cost: " + netCost);
        System.out.println("Gross value (including 23% VAT): " + grossValue);
        System.out.println("Net value after selling 10,000 pieces (excluding VAT): " + netValueAfterSale);

        // Closing the scanner
        scanner.close();
    }
}