import  java.util.Scanner;

public class Matriz {
    
    private float[][] matriz;   // declarando matriz
    private int tam;

    public Matriz(){
        this.tam = 2;
        this.matriz = new float [tam][tam]; // definindo matriz

       for (int i = 0; i < matriz.length; i++) {        // intanciando como todos os elementos zerados
           for (int j = 0; j < matriz.length; j++) {
               matriz[i][j] = 0.0f;
           }
       }
        
    }

    public void setMatriz (){
        Scanner num = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("linha[%d] coluna[%d] = ", i+1 , j+1);    // preenchimento de cada indice
                matriz[i][j] = num.nextFloat();
            }
        }
    }

    private float determinante(){
        return ((this.matriz[1][1] * this.matriz[0][0]) - (this.matriz[1][0] * this.matriz[0][1]));   // calculo da determinante 2 x 2 
    }

    public void getMatriz () {
        
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {           // impressão de matriz formatada.
            for (int j = 0; j < matriz.length; j++) {
                if( j == 0 ){
                    System.out.printf("|");
                }
                System.out.print(" " + matriz[i][j] + " "); 
            }
            System.out.print("|");
            System.out.printf("\n");
        }

        System.out.println();
        System.out.println("determinante = " + determinante());
    }


}
