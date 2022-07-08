import java.util.Scanner;

//Escreva um programa que receba um número de 3 dígitos no formato CDU e o
//reescreva no formato UCD. Exemplo: 123 deve ser reescrito como 312

public class quest5 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        int numero, C, D, U, aux, resto;

        System.out.println("Escreva aqui um numero de 3 digitos :");
        numero = entrada.nextInt(); // coletando a centena do usuário
        
        C = (int) numero / 100;     //extradino o intero da centena
        aux = C * 100;
        resto = numero - aux;

        D = (int) resto / 10;       //extradindo o inteiro do decimal
        aux = D * 10;
        resto = resto - aux;        //colentando a unidade

        U = resto;

        System.out.printf("%d%d%d",U,D,C);

        entrada.close();

    }
}
