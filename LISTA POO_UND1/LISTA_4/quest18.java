//Crie uma função recursiva que verifique se um dado número é primo.

import java.util.Scanner;

public class quest18 {
        public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        
        int n=0;
        boolean resultado;
        
        System.out.println("Insira um numero para verificar se eh primo:");
        n = sc.nextInt();

        resultado = ehprimo(n, 2);

        System.out.println("\nO numero " + n + " eh primo? \nRESPOSTA:" + resultado); // resultado diz se meu candidato eh primo por : true or false.
        
        sc.close();
    }

    public static boolean ehprimo ( int n , int div ){
        if(n == 0 || n==1){ // aqui eu trato meu N quando for 0 e 1, pois não são primors
            return false;
        }
        else if(n/2 < div){ // forma de tratamento a partir de N == 2, quando o divisor for incrementado até q chegue neste pornto, eu digo q meu candidato eh primo.
            return true;
        }else{
            if(n % div == 0){   // se for par não eh primo, ou depois qualquer div+1
                return false;   // o div(divisor) vai sendo incrementado e verificado se é divisilel por 3, por 4, por 5, se for , meu candidado não será primo
            }else{
                return ehprimo( n , div+1); // incremento dos divisores
            }
        }

    }

}
