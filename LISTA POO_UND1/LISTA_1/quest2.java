import java.util.Scanner;

// Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.

public class quest2 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double nota1 , nota2, nota3, media; // 3 notas + media
        
        int mediaInt; // armazena a nota arredondada(Math.round) como um int

        System.out.println("Digite a nota 1 : "); // coleta nota 1
        nota1 = entrada.nextDouble();

        System.out.println("Digite a nota 2 : "); // coleta nota 2
        nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 2 : "); // coleta nota 3
        nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3)/3;

            System.out.printf("\nValor da media  :             %.2f \n" , media); // mostra a nota antes do arredondamento 

            mediaInt = (int) Math.round(media);     // resultado do Math.round em double é transformado em int
        
            System.out.printf("O valor da media arredondada : %d,00 \n", mediaInt); 
        
        entrada.close();

    }
}
