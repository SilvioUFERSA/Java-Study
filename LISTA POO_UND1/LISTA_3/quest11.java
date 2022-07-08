// 11. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo.
// Assuma que n>0.


import java.util.Scanner;

public class quest11 {
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            long prox = 1, ant = 0;  // prox eh meu primeiro termo de fibonacci, e anterior a ele eh 0
            int i, n;               // n-ésimo termo eh o q eu procuro

            System.out.println("Digite um numero inteiro para o N-esimo termo de Fibonacci: ");
            n = sc.nextInt();

            sc.close();

            for(i = 1; i <= n; i++){ 
                prox = prox + ant;      // meu       proximo termo : termo "autual" + anterior
                ant =  prox - ant;      // meu       anterior : meu proximo - anterior
                                        // aqui      anterior virou meu "atual"(numero q foi imrpesso na ultma interação do laço).
                System.out.printf("%d  ",prox); 
            }// proximo = numero q irei imprimir, ant = numero q acabou de ser impresso.
            System.out.printf("\n%d  ",prox); // se eu quiser saber o proximo aqui é so eu fazer : prox + ant. 
            
        }
    
}
