//19.Dado um polinômio


import java.util.Scanner;

public class quest19 {           // eu não soube fazer.

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = 0, reposta = 0;

        System.out.println("Digite um valor para x:");
        x = sc.nextInt();

        reposta = polinomio(x);

        sc.close();

        System.out.printf("Reposta: %d", reposta);
    }

    public static int polinomio(int x){ 

        return 1;
    }

}
