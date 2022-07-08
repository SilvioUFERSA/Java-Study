/*
47.Utilizando uma pilha, escreva um programa que verifique se uma string de
entrada formada apenas por ’(’ e ’)’ está balanceada
 */

import java.util.Stack;

public class questao47 {
   
    final static String ABRE = "(";     // constante
    final static String FECHA = ")";    // constante
   
    public static void main(String[] args) {
        
        System.out.println(verificaBalanceamento("A + B") ? "balanceado" : "desbalanceado");
        System.out.println(verificaBalanceamento("(A + B)") ? "balanceado" : "desbalanceado");
        System.out.println(verificaBalanceamento("A + B)") ? "balanceado" : "desbalanceado");    
    
    }

    public static Boolean  verificaBalanceamento (String expressao){

        boolean balanceado = true;

        Stack<Character> pilha = new Stack<Character>();
        int i = 0;
        char aux, topo;

        while (i < expressao.length() && balanceado){   // tamanho da expressoa
            aux = expressao.charAt(i);                  // retorna um caracter da posição i da string
            
            if(ABRE.indexOf(aux) >= 0){ // para saber qual índice(caracter) da string corresponde, isso reporta um (int)
                pilha.add(aux);
            }
            else if (FECHA.indexOf(aux) >= 0){
                if( pilha.isEmpty()){ // verficando se a pilha está vazia
                    balanceado = false;
                    return balanceado;
                } 
                else{
                    topo = pilha.pop();
                    if(ABRE.indexOf(topo) != FECHA.indexOf(aux)){ // se o que abri for diferente do que fechei, está desbalanceada
                        balanceado = false;
                        return balanceado;
                    }
                }
            }
            i++;
        }
        return balanceado;
    }

}
