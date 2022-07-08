/*
45.Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então,
cria um segundo objeto LinkedList contendo uma cópia da primeira lista, mas na
ordem inversa. Não devem ser utilizados métodos da Java API para realizar a
inversão.
 */


import java.util.LinkedList;
import java.util.Scanner;

public class questao45 {
    
    public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {
        String e;
        int i;
        LinkedList <String> ll = new LinkedList<String>();
        LinkedList <String> lInversa = new LinkedList<String>();
           
        System.out.println("digite 10 caracteres: "); 

            for (i=0; i<10 ; i++){  // preenche a linked list
                e = sc.nextLine();
                ll.add(e);
            }

            lInversa = ll; // faz a copia da linked list preenchdia

            System.out.println("ordem inversa:");

            for (i=0 ; i<10; i++){
                System.out.print(lInversa.getLast() + ", ");    // pego o ulto elemento
                lInversa.removeLast();                          // removo o ultimo elemento
            }
            

            sc.close();
        }
    }
}
