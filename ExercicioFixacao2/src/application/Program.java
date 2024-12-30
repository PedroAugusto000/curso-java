package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.println("=====PRODUCTS PROGRAM====");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println("");

        for (int i = 1; i <= n; i++) {
            System.out.println("====PRODUCT #" + i + " data====");
            System.out.print("TYPE: Common, used, imported (c/u/i): ");
            char ch = sc.next().charAt(0);
            sc.nextLine(); // Limpar buffer do scanner
            System.out.print("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
            System.out.print("Enter the product price: ");
            double price = sc.nextDouble();

            if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("");
        System.out.println("===PRODUCT LIST===");
        for (Product product : list) {
            System.out.println(product);
        }

        sc.close();
    }
}
