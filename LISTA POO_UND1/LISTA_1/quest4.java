import java.util.Scanner;

// Escreva um programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit.

public class quest4 {
    
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        double C=0, F=0;

        System.out.println("Digite a temperatura em Celcius: ");
        C = input.nextDouble();

        F = (C * 1.8) + 32; 

        System.out.printf("\n%.2f Celcius -> %.2f Fahrenheit", C, F);

        input.close();

    }

}
