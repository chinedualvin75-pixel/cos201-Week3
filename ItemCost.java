
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of one item: ");
        double price = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative.");
        } else {
            double totalCost = price * quantity;
            System.out.println("Total cost: " + totalCost);
        }

        input.close();
    }
}
