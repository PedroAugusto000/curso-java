package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Enter client data
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(clientName, clientEmail, birthDate);

        // Enter order data
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            sc.nextLine(); // Consume newline
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        // Print order summary
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
