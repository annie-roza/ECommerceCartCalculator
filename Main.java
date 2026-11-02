import java.util.ArrayList;
import java.util.List;

class Item {
    String name;
    String price;
    boolean inStock;

    // Constructor
    Item(String name, String price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}

public class Main {

    public static double calculateAvailableTotal(List<Item> items) {

        double total = 0.0;

        for (Item item : items) {

            if (item.inStock == true) {

                // Remove dollar symbol
                String cleanPrice = item.price.replace("$", "");

                // Convert String to double
                double numericPrice = Double.parseDouble(cleanPrice);

                // Print available item
                System.out.println("Item: " + item.name +
                        " | Price: " + numericPrice);

                // Calculate total
                total += numericPrice;
            }
        }

        System.out.printf("Total Cost: %.2f%n", total);

        return total;
    }

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("Pliers", "$12.50", true));
        items.add(new Item("Hammer", "$25.00", false));
        items.add(new Item("Screwdriver", "$8.20", true));

        calculateAvailableTotal(items);
    }
}