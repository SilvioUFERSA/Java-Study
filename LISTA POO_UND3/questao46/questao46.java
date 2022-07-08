/*
46.Escreva um programa para contar o número de ocorrências de cada letra em
uma String. Por exemplo, a string "HELLO THERE" contém dois H s, três E s,
dois L s, um O , um T e um R . Exiba os resultados.
 */


import java.util.HashMap;
import java.util.TreeSet;

public class questao46 {
	
        public static void main(String[] args) {
            String texto = "HELLO THERE";
            HashMap<Character, Integer> mapa = new HashMap<>(); // minha chave String é o indice da hash, toda vez que a chave aparecer, o contador é adicionado
            String[] palavras = texto.split(" "); // aqui é retornado um array para palavras em que cada posição armazena uma das substrings que foram separadas pelo .split


    
            for ( String palavra: palavras){
                
                for (int i = 0; i < palavra.length(); i++) {
                    palavra = palavra.toLowerCase();        //colocando cada indice(string) minisculo
                  
                    Character minusculo = palavra.charAt(i);    // pegando caracter a caracter da string
    
                  if(mapa.containsKey(minusculo)){      //  chave é o caracter
                      int num = mapa.get(minusculo);    //  mum recebe a occrencia do caracter
                      mapa.put(minusculo, num + 1);     //  caracter , sua ocorrencia , é adicionado à hash
                  }else {
                      mapa.put(minusculo, 1);    // caso a chave da hash seja unica
                  }
                }
            }
//keySet basicamente retorna uma visão do conjunto das chaves ou podemos criar um novo conjunto e armazenar os elementos-chave neles.  
            TreeSet<Character> caracterOrdenado = new TreeSet<>(mapa.keySet()); 
            for (Character palavra : caracterOrdenado) {    // ORDENA DA MAIOR OCRRENCIA PARA MENOS
                System.out.printf("%c possui %s ocorrencia(s)\n", palavra, mapa.get(palavra));
            }
    
            System.out.println("MAP ORIGINAL -> " + mapa);
    }
}