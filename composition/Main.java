import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

public class Main{

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do Departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.print("Entre com dados do trabalhador");
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Nivel:");
		String level = sc.nextLine();
		System.out.println("Salaio Base:");
		double salary = sc.nextDouble();

		Worker worker1= new Worker(name, WorkLevel.valueOf(level) , salary, new Department(departmentName));
		
		System.out.println("quantos contratos o trabalhados terá?");
		int contracts = sc.nextInt();
		for(int i=1; i <= contracts; i++ ) {
			System.out.println("Enter contract(" + i + "):");
			System.out.print("Data (dd/MM/yyyy): ");
			Date contractDate  = simpleDate.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valor = sc.nextDouble();
			System.out.println("Total de horas:");
			int horas = sc.nextInt();
			
			HourContract houerContract = new HourContract( contractDate, valor, horas); 
			worker1.addContract(houerContract);
		}
		
		System.out.println("Entre com o mes e ano (MM/yyyy):" );
		String monthAndYer = sc.next();
		int month = Integer.parseInt(monthAndYer.substring(0,2));
		int year = Integer.parseInt(monthAndYer.substring(3));
		System.out.println("Name:" + worker1.getName());
		System.out.println("Departamento:" + worker1.getDepartment());
		System.out.println("Total de ganhos em " + monthAndYer  +": R$" + String.format("%.2f", worker1.income(year, month)));
		sc.close();
	}
	
}