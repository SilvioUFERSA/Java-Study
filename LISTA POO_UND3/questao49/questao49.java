/*
49.Escreva um programa que:
- armazene em um vetor os nomes dos meses do ano
- solicite ao usuário que digite um valor inteiro
- mostre o nome do mês correspondente ao número digitado
- trate as exceções geradas pela digitação de valores inválidos para o
índice do mês
 */


import java.util.InputMismatchException;
import java.util.Scanner;


public class questao49 {
    
    public static void main(String[] args) {
        String[] mes = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "junho", "Julho","Agost", "Setembro","Outubro","Novembro","Dezembro"};
        boolean persiste = false;
        int referencia = 0;
        
        while(!persiste){
            
            try{

                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um inteiro");
                referencia = sc.nextInt();

                persiste = true;
                sc.close();
                continue;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ) {
                System.err.println(arrayIndexOutOfBoundsException);
                System.out.println("Indice nao existente, Tente novamente: ");
                System.out.printf("respostas[%d] = %d%n%n", mes, mes[referencia]);
            } 
            catch (InputMismatchException inputMismatchException) {
                System.err.println("ERRO : " + inputMismatchException);
                System.out.println("Entrada ivalida, Tente novamente: ");
            }
   
        }
        
        System.out.println(mes[referencia-1]);

    }
}