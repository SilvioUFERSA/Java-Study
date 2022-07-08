//16.Modifique a função do fatorial para exibir sua variável local e o parâmetro de
//chamada recursiva. Para cada chamada recursiva, exiba as saídas em uma
//linha separada e adicione um nível de recuo (tabulação). Faça o melhor que
//você puder para tornar a saída limpa, interessante e significativa. Seu objetivo
//aqui é projetar e implementar um formato de saída que facilite o entendimento
//da recursão.


import java.util.Scanner;

public class quest16 {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int i, fat=0, var = 0, resultado =0;

        System.out.printf("Calculo do Fatorial de : ");
        fat = sc.nextInt();

        sc.close();
        
        var = fat;

        resultado = fatorial(fat, var);

        System.out.println("como acontece na recurssão: ");
        for(i = 1; i <= fat ; i++ ){
            System.out.printf("%d " ,i);
            if(i != fat){
                System.out.printf("* ");
            }
        }

        System.out.printf(" = %d \n", resultado);

       
    }

    public static int fatorial( int n , int var_local ){
        
        if(n == 0){
            return 1;
        }else{
            System.out.printf("%d * fatorial(%d)\n", var_local, n-1) ;
            return n * fatorial( n-1 , var_local-1);  
        }
    }
}





