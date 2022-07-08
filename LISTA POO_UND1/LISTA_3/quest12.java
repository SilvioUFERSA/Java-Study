//12.Escreva um programa que escreve os 4 primeiros números perfeitos. Um
//número perfeito é aquele que é igual à soma dos seus divisores (exceto o
//próprio número). Exemplos: 6=1+2+3, 28=1+2+4+7+14.


public class quest12 {

    public static void main(String[] args) {        
    
    System.out.println("os 4 primeiros numero perfeitos");
 
    int soma, i , j;
 
    for (i=1; i<=8128; i++) {       // I é meu candidato a numero perfeito
 
        soma = 0;
                                    // nenhum numero de ( I/2 + 1 ) fará parte da somatória para verificar se o numero realmente eh pereito por que não fará parte da condição.
        for (j=1; j<=(i/2); j++) {  // j são os divisores do numero (i). (i/2) j começa de 1 e vai até (i/2) que deve ser pelo menos divisivel PELO MENOS POR i 
            if ((i % j) == 0) {     // verifico se é divisivel
                soma += j;          // aqui somo todos os resultados de J caso sejam de resto 0.
            }
        }
 
            if (i == soma){                   // aqui eu verifico se a soma dos (jotas) divisores são meu numero candidato a ser perfeito.
                System.out.printf("%d\n", i); // então eu printo meu numero perfeito.
            }
    }
    
  }

}
