package aplication;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.OnlinePaymentService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate localDate = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do Contrato: ");
        Double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        Integer installment = sc.nextInt();

        Contract contract = new Contract(number, localDate, contractValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installment);

        System.out.println("Parcelas:");

        for(Installment installment1i : contract.getInstallments()){
            System.out.println(installment1i);
        }

        sc.close();
    }
}
