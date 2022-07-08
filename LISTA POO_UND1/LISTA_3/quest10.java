//Escreva um programa para imprimir uma versão aproximada de um cartão da
//Mega-Sena (somente com os números, respeitando o número de linhas e a
//distribuição dos números nas linhas).
public class quest10 {
    
    public static void main(String[] args) {
        int l, c, num = 1;  //l - Linha     c - Coluna
        
        for(l = 1 ; l <= 6; l++ ){          // ao começar na linha uma
            for( c = 1; c <= 10 ; c++ ){    // preenche 1 a 10 colunas na primeira linha e vai para a linha 2.
                if(num <10){
                    System.out.printf("[0%d]  ", num); //controlando o que deve ser impresso no colchete para fins de alinhamento, nesse caso colocar o 0 junto ao inteiro de 1 até 9
                        num++;
                }else{
                    System.out.printf("[%d]  ", num);  // caso num ja seja 10, não preciso colocar 0 pois o inteiro ja ocupa duas posições.
                        num++;
                }
            }
            System.out.println("\n");       // quebra de linha da matriz
        
        }

    }

}