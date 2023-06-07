package Aplication;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program{
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of product");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Product #" + (i+1) + " data:");
			
			System.out.print("Common, used or imported(c/u/i)? ");
			char op = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(op) {
				case 'c':
					Product product = new Product(name, price);
					products.add(product);
				break;
				
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					Product productUsed = new UsedProduct(name, price, date);
					products.add(productUsed);
				break;
				
				case 'i':
					System.out.print("Customs fee: ");
					double customs = sc.nextDouble();
					Product productImported = new ImportedProduct(name, price, customs);
					products.add(productImported);
				break;
			}
		}
		
		System.out.println();
		System.out.println("Price tags: ");
		for(Product p: products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
