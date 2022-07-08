import java.util.Scanner;

public class quest7{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int valorCarta=0;
        int naipe=0;

        System.out.println("Digite um valor para a Carta: ");
        valorCarta = entrada.nextInt();

        System.out.println("Digite um valor para o Naipe: ");
        naipe = entrada.nextInt();

        String resultCarta ="Nulo" , resultNaipe="Nulo";

        if(valorCarta == 1){
            resultCarta = "As";
        }
        else if(valorCarta == 2){
            resultCarta = "Dois";
        }
        else if(valorCarta == 3){
            resultCarta = "Tres";
        }
        else if(valorCarta == 4){
            resultCarta = "Quatro";
        }
        else if(valorCarta == 5){
            resultCarta = "Cinco";
        }
        else if(valorCarta == 6){
            resultCarta = "Seis";
        }
        else if(valorCarta == 7){
            resultCarta = "Sete";
        }
        else if(valorCarta == 8){
            resultCarta = "Oito";
        }
        else if(valorCarta == 9){
            resultCarta = "Nove";
        }
        else if(valorCarta == 10){
            resultCarta = "Dez";
        }
        else if(valorCarta == 11){
            resultCarta = "Valete";
        }
        else if(valorCarta == 12){
            resultCarta = "Dama";
        }
        else if(valorCarta == 13){
            resultCarta = "Rei";
        }else{
            System.out.println("Valor invalido, digite novamente: "); // pequeno tratamento de erro
            valorCarta = entrada.nextInt();
        }

        if(naipe == 1){
            resultNaipe ="Ouros";
        }
        else if(naipe == 2){
            resultNaipe="Paus";
        }
        else if(naipe == 3){
            resultNaipe="Copas";
        }
        else if(naipe == 4){
            resultNaipe="Espadas";
        }else{
            System.out.println("Valor invalido, digite novamente: "); // pequeno tratamento de erro
            naipe = entrada.nextInt();
        }

        entrada.close();

        System.out.printf("%s de %s.", resultCarta, resultNaipe);

        

    }

}