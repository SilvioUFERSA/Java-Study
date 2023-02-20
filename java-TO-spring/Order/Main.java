import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;


public class Main{

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat currently_sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println(" -- Dados do Cliente:");
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Email");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (dd/MM/yyyy:");
		String nascimento = sc.next(); 
		
		Client c1 = new Client(name, email, sdf.parse(nascimento));
		
		System.out.println("-- Dados do Pedido");
		System.out.print("Status:");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), orderStatus, c1);
		
		System.out.print("Quantos items o pedido possui? ");
		int nOrder = sc.nextShort();
		
		
		for (int i = 0; i < nOrder; i++) {
			System.out.println("Dados do pedido" + "(" + i+1 + ")");
			System.out.print("Nome: ");
			String productName = sc.next();
			System.out.print("Preço: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);		
			OrderItem orderItem = new OrderItem(productQuantity, productPrice);
			
			order.addItem(orderItem);
		}
		
		System.out.println("Detalhes:");
		System.out.println(order);
		
		
		sc.close();
		
	}
	
}