import java.util.Scanner;

public class quest9 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        double x1=0, y1=0, x2=0, y2=0;

        String position1 ="Nulo", position2="Nulo";

        System.out.println("Digite o primeiro ponto para X1");
        x1= entrada.nextDouble();
        
        System.out.println("Digite o primeiro ponto para Y1");
        y1= entrada.nextDouble();

        System.out.println("Digite um ponto X2");
        x2= entrada.nextDouble();

        System.out.println("Digite um ponto Y2");
        y2= entrada.nextDouble();

        entrada.close();

        if((x2 < x1) && (y2 < y1)){         // testado
            position1 = "Abaixo";
            position2 = "e A esquerda";
        }
        else if((x2 > x1) && (y2 > y1)){    // testado
            position1 ="Acima";
            position2= "e A direita";
        }
        else if((x2 > x1) && (y2 < y1)){    // testado
            position1 ="Abaixo";
            position2= "e A direita";
        }
        else if((x2 < x1) && (y2 > y1)){    // testado
            position1 ="Acima";
            position2= "e A esquerda";
        }
        else if((x2 == x1) && (y2 > y1)){   // testado
            position1 ="Exatamente";
            position2= "Acima";
        }
        else if((x2 == x1) && (y2 < y1)){   // testado
            position1 ="Exatamente";
            position2= "Abaixo";
        }
        else if((x2 < x1) && (y2 == y1)){   // testado
            position1 ="Exatamente";
            position2= "A esquerda";
        }
        else if((x2 > x1) && (y2 == y1)){   // testado
            position1 ="Exatamente";
            position2= "A Direita";
        } else{                             //testado
            position1 = "Extamente";
            position2 = "no mesmo Ponto";
        }

        System.out.printf("|| O ponto(x2,y2) esta %s %s do Primeiro ponto(x1,y1).  ||", position1, position2);

        
        
    }
}
