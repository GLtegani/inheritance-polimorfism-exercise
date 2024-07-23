package ex2;

import ex2.entities.ImportedProduct;
import ex2.entities.Product;
import ex2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        Integer productsAmount = sc.nextInt();
        sc.nextLine();
        List<Product> productList = new ArrayList<>();

        for(int i = 0; i < productsAmount; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();

            if(typeProduct == 'i') {
                System.out.print("Customs fee: ");
                Double productFee = sc.nextDouble();
                Product importedProduct = new ImportedProduct(productName, productPrice, productFee);
                productList.add(importedProduct);
            } else if(typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String productManufactureDate = sc.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate productDate = LocalDate.parse(productManufactureDate, formatter);

                Product usedProduct = new UsedProduct(productName, productPrice, productDate);
                productList.add(usedProduct);
            } else {
                Product commonProduct = new Product(productName, productPrice);
                productList.add(commonProduct);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for(Product product : productList) {
            System.out.println(product);
        }



        sc.close();
    }
}
