
import java. util.Scanner;

//Escreva um programa que recebe um valor inteiro representando um intervalo
//em minutos e imprime o equivalente a esse período expresso em valores inteiros
//para dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

public class quest6 {
    
        public static void main(String[] args){

            Scanner min = new Scanner (System.in);

            int minInput, dias=0, horas=0 , minuts=0, aux=0, minInit;

            System.out.println("Digite o valor inteiro em minutos : ");
            minInput = min.nextInt();

            minInit = minInput;                 // preservei o minuto incial para mostrar no final, ja que o minInput será alterado

            dias = (int) minInput / 1440;       // toal de minutos para coletar os dias em INT , um dia tem 1440 minutos
            aux = dias * 1440;                  // se tenho 6 dias, entao 6 * 1440 me mostrara agora as Horas em minutos, a variavel auxiliar me ajuda a separar os dias das horas
            minInput = minInput - aux;          // recebo um novo total de minutos - os dias;

            horas = (int) minInput / 60;        // ja que eu contei os dias na parte de cima, então so falta saber as horas que está no dia
            aux = horas * 60;                   // a variavel auxiliar me ajuda a separar as horas de minutos.
            minInput = minInput - aux;          // recebo um novo total de minutos - os minutos que sobramram.

            minuts = minInput;                  // so reatribui por fim de organização, já que isso são os minutos restantes.

            System.out.printf("%d min Sao  --->>>  %d Dias : %d Horas : %d Minutos", minInit ,dias , horas, minuts );

            min.close();

        }
}
