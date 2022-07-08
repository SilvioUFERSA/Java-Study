public class Elevador {

    public int andarAtual;
    public int pessoas;
    public int totalAndares;
    public int capacidade;

    public Elevador (){                                         // contrutor em que se inciar tudo em um estado zerado

        andarAtual = 0;
        pessoas = 0 ;
        totalAndares = 0;
        capacidade = 0;
    }

    public void inicializa(int capacidade, int totalAndares){   //requisito da questão
        
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;

    }

    public void entra(){                                        // incremento de pessoas

        if ( pessoas < capacidade ){
            pessoas = pessoas + 1; 
        } else {
            System.out.println("O elevador atingiu a capacidade maxima;"); // se ja tiver na capacidade maxima, ninguem mais entra
        }
    
    }

    public void sai(){                                          //decremento de pessoas

        if( pessoas > 0 ){
            pessoas = pessoas - 1;
        } else {
            System.out.println("O elevador esta vazio!");       // se não tiver ninguem, ninguem sai
        }

    }

    public void sobe(){                                         // andares pecorridos em subida
        
        if(andarAtual < totalAndares){
            andarAtual = andarAtual + 1;
        } else {
            System.out.println("o elevador esta no andar maximo"); // se o elevador estiver no andar maximo, ele não sobe mais
        }
    
    }

    public void desce(){

        if(andarAtual > 0 ){                                    //andares peccoridos em descida
            andarAtual = andarAtual - 1 ;
        } else {
            System.out.println("o elevador esta no terreo");    // se o elevador estiver no terreio, ele não desce mais
        } 

    }

    public void statusElevador () {                             // status para vizualizar melho o que está acontecendo no elevador
        System.out.println("andar atual: " + andarAtual);
        System.out.println("pessoas: " + pessoas);
        System.out.println("total andares: " + totalAndares);
        System.out.println("capacidade: " + capacidade );
        
    }
}
