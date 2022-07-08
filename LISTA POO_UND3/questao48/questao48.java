/*
48.Faça um programa para somar dois números:
- O programa deve conter um método int obterIntValido() para receber
número inteiro válido
i. Enquanto o valor não for um número inteiro, deve-se solicitar um
novo número e exibir uma mensagem de erro.
- O método principal deve utilizar obterIntValido para obter os dois
operandos da soma

 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class questao48 {
    
    public static void main(String[] args) {
    
        
        int num1=0;
        int num2=0;

        boolean persiste = false;

    while (!persiste) {
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("Primeiro numero:");
            obterIntValido(num1 = sc.nextInt());

            System.out.println("Segundo numero:");
            obterIntValido(num2 = sc.nextInt());

            persiste = true;
            
            sc.close();
        }catch(InputMismatchException inputMismatchException){
            System.err.println("ERRO : " + inputMismatchException);
            System.out.println("Entrada ivalida, Tente novamente: ");
        } 
    }
        System.out.println("soma = " + (num1 + num2));
    
    }

    public static int obterIntValido(int n) {
        return n;
    }
 }

