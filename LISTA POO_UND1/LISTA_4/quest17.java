//17.Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n .
//O mdc de m e n é definido recursivamente como segue:
//a. se n > m, retorne mdc(n, m);
//b. se n = 0, retorne m;
//c. senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.


import java.util.Scanner;

public class quest17 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m=0, n=0, resultado =0;

        System.out.println("Digite M e N para saber o MDC!");
        System.out.println("Insira M: ");
        m = sc.nextInt();
        System.out.println("Insira N: ");
        n = sc.nextInt();

        resultado = mdc(n, m);

        System.out.println("MDC:" + resultado);

        sc.close();
    }

    public static int mdc (int m, int n){  // 0/m

        if( n == 0){
            return m;               //seguindo instrução da questão
        }
        else if(n > m){             //inversão.
            return mdc(n, m);       //seguindo instrução da questão
        }
        else{  
            return mdc(n , m%n);    //seguindo instrução da questão
        }


    }//linha da function

}
