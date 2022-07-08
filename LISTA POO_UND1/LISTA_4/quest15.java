//Crie uma função recursiva potencia(base,expoente) que, quando chamado,
//retorna baseexpoente
//Por exemplo, potencia(3,4) = 3 * 3 * 3 * 3.
//Assuma que expoente é um inteiro maior ou igual a 1.

import java.util.Scanner;

public class quest15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int base = 0, exp = 0 , resultado =0;

        System.out.println("Digite a base: ");
        base = sc.nextInt();

        System.out.println("Digite o expoente: ");
        exp = sc.nextInt();

        resultado = potencial(base, exp);
           
        System.out.println(resultado);
        
        sc.close();
    }

    public static int potencial ( int base, int expoente) {
        if( expoente == 0 ){ // minha condição de parada, partindo que eu sei que qualquer numero elevado a zero é 1.
           return 1; 
        } else{
            return base * potencial(base, expoente-1) ; // aqui é como se eu multiplicasse a base * base e vou subitraindo as evzes que multiplico, o expoente serve de contador3
        }
    }

}
