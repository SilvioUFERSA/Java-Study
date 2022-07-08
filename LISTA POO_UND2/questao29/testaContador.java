//29.Escreva a classe Contador que encapsule um valor usado para contagem de
//eventos. Esta classe deve esconder o valor encapsulado de
//programadores-usuários, fazendo com que o acesso ao valor seja feito através
//de métodos que devem zerar, incrementar e imprimir o valor do contador.
//Escreva um aplicativo de teste que demonstra as capacidades da classe criada.

// ccódigo testado.

public class testaContador {
    
    public static void main(String[] args) {
        Contador c1 = new Contador();

        // Contador.eventos = 10; este comando é impossivel de ser executado.

        System.out.println("valor do contador: " + c1.getImprimir());

        c1.setIncrementar();    // era 0, incrementei  1
        c1.setIncrementar();    // era 1, incrementei + 1
        c1.setIncrementar();    // era 2, incrementei + 1 = 3

        System.out.println("valor do contador: " + c1.getImprimir());
    
        c1.setZerar();          // zerei meu contador

        System.out.println("valor do contador: " + c1.getImprimir()); // isso aqui deve ser = ZERO
    }

}
