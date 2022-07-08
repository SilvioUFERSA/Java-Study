//30.Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado
//ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada
//esta acesa). Inclua um método estaLigada que retorne verdadeiro se a lâmpada
//estiver ligada e falso caso contrário. Adicione um campo que indique quantas
//vezes a lâmpada foi acesa. Para isso, utilize uma instância da classe Contador
//criada na questão anterior e implemente a lógica necessária para atualizar seu
//valor. Escreva um aplicativo de teste que demonstra as capacidades da classe
//criada.

// código testado.

public class testaLampada{

    public static void main(String[] args) {
        
        Lampada l1 = new Lampada();
        
        // no meu construtor, a instancia inicial da Lampada é - desligada
        // meu private contador é = 0 ( por que não ascendi nenhuma vez);

        l1.mostraEstado();
        
        l1.acende();           // contador = 1
        l1.mostraEstado();       
        
        l1.apaga(); 
        l1.mostraEstado();
        
        l1.acende();           // contador = 2;
        l1.mostraEstado();

        l1.apaga();
        l1.mostraEstado();

        System.out.println("a lampada foi acesa: " + l1.getMostraContador() + " vezes");
    
        // outrs testes a segui: 
        System.out.printf("\n");

        l1.acende();
        l1.mostraEstado();
        l1.acende();
        l1.mostraEstado();  //aqui é para mostrar que posso tentar acender porém meu contador n muda.
        

        l1.apaga();
        l1.mostraEstado();
       

        System.out.println("a lampada foi acesa: " + l1.getMostraContador() + " vezes");

    }

}