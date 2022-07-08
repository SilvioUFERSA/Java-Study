//13.Escreva um programa que determine quais são todos os números de 3
//algarismos cuja soma dos cubos de seus algarismos sejam iguais ao próprio
//número. Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.


public class quest13 {

    public static void main(String[] args) {
    
        int i=100 , num = 0;    // meu i representa todos os possiveis 3 algarismos desde o 100 a 999
        int soma = 0;           // soma guarda o resultado das somas dos numeros elevados ao expoente 3
        int a=0, b=0, c=0;      // aqui eu pego as unidade, dezenas, centenas

        
        for(i = 100 ; i < 1000; i++ ){      // pecorre de 100 a 999 - "todos os numero de 3 algarismos" - isso é meu numero candidato
            
            a = (int) i / 100;                  //transformo a centena em unidade pra fazer seu cubo
            b = (int)(i - (a * 100))/10;        //transformo a dezena em unidade pra fazer seu cubo
            c = i - ( (a * 100) + (b * 10) );   //pego somente a unidade pra fazer seu cubo

            num = (a*100) + (b*10) + (c *1);    // retransformo os numero para pegar meu numero cheio e comparar com a soma
                                                // seu eu quisesse eu deixava so o I (variavel de controle) que tambem iria servir para minha comparação da linha 21.
                                                // porem preferi deixar mais explicito, pois foi meu primeiro pensamento.
            soma = (int)(Math.pow(a , 3) + Math.pow(b , 3) + Math.pow(c , 3)); //elevo todo meu numero de 3 algarismo transformado em unidade à potencia de 3.
            if( soma == num){                   // so comparo se a soma dos algarismos elevados a potencia de 3 são também são meu numero cadidato
                System.out.printf("%d\n", num);
            }
            
        }
    }

}
