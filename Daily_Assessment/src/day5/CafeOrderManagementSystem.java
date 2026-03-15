package day5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Write your logic here:

enum ItemType {
    BEVERAGE,
    PASTRY
}

interface Orderable {
    double getPrice();
}

abstract class MenuItem implements Orderable {

    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Beverage extends MenuItem {

    public Beverage(String name, double price) {
        super(name, price);
    }
}

class Pastry extends MenuItem {

    public Pastry(String name, double price) {
        super(name, price);
    }
}

class Order {

    List<Orderable> items = new ArrayList<>();

    public void addItem(Orderable item) {

        items.add(item);

        MenuItem menuItem = (MenuItem) item;
        System.out.println("Order Added: " + menuItem.getName());
    }

    public double calculateTotal() {

        double total = 0;

        for (Orderable item : items) {
            total += item.getPrice();
        }

        System.out.println("Total Order Cost: " + total);
        return total;
    }
}

// Non editable starts here
public class CafeOrderManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            int action = scanner.nextInt();
            scanner.nextLine();

            if (action == 4) {
                break;
            }

            switch (action) {
                case 1:
                    String beverageName = scanner.nextLine();
                    double beveragePrice = scanner.nextDouble();
                    scanner.nextLine();
                    Beverage beverage = new Beverage(beverageName, beveragePrice);
                    order.addItem(beverage);
                    break;

                case 2:
                    String pastryName = scanner.nextLine();
                    double pastryPrice = scanner.nextDouble();
                    scanner.nextLine();
                    Pastry pastry = new Pastry(pastryName, pastryPrice);
                    order.addItem(pastry);
                    break;

                case 3:
                    order.calculateTotal();
                    break;

                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }

        scanner.close();
    }
}
// Non editable ends here

