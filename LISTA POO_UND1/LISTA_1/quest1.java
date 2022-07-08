import java.util.Scanner;

// Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.

public class quest1{

    public static void main (String[] args){

        Scanner entrada = new Scanner (System.in);

        double lado, area;

        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextDouble();

        area = Math.pow(lado, 2); // A = L^2

        System.out.printf("A area do quadrado eh: %.2f \n", area); // %Q usado para duble

        entrada.close();
    }

}