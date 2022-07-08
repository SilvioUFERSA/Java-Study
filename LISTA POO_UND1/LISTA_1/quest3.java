import java.util.Scanner;

// Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
//Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.

public class quest3 {

        public static void main (String[] args){
           
            Scanner entrada = new Scanner(System.in);


            double graus, radio, sen, cos, tg, sec, cossec, cotg;

            System.out.println("Digite o valor em graus: ");
            
            graus = entrada.nextDouble();
        
            radio = (graus * Math.PI) / 180;

            cos = Math.cos(radio); // após convertido graus em radiano, fazemos as proximas operações com graus transformado em radiano
            sen = Math.sin(radio);
            tg  = Math.tan(radio);

            sec    = 1 / cos;      // secante é o inverso do cosseno
            cossec = 1 / sen;      // cossec é o inverso do seno
            cotg   = 1 / tg;       // cotg é o inverso da tangente

             System.out.printf("- %.2f ° eh : %.3f radianos \n", graus, radio);

             System.out.printf("- cosseno de %.2f eh: %.6f \n", graus, cos );
             System.out.printf("- seno de %.2f eh: %.6f \n", graus, sen );
             System.out.printf("- tangente de %.2f eh: %.6f \n", graus, tg );
             
             System.out.printf("- secante de %.2f eh: %.6f \n", graus, sec );
             System.out.printf("- cossecante de %.2f eh: %.6f \n", graus, cossec );
             System.out.printf("- cotangente de %.2f eh: %.6f \n", graus, cotg );

             entrada.close();
        }

}
