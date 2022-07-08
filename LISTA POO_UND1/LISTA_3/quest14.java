public class quest14 {
    
        public static void main (String[] args){
            
            double cA =7000, cB=20000;
            int ano=0;

            while( cA < cB ){
                System.out.printf("A = %.2f    -  B = %.2f    ANO: %d \n", cA, cB, ano);
                cA = cA + (cA * 0.035); // bem simples, um laço para contar em quantos anos a cidade a será menor que a B, assim q a cidade A for maior eu encerro meu laço.
                cB = cB + (cB * 0.01);
                ano++;
                
            }

            System.out.printf("\nA = %.2f    -  B = %.2f    ANO: %d\n", cA, cB, ano);

            System.out.println("cidade A sera maior que cidade B em " + ano + " anos");
            
        }
}
