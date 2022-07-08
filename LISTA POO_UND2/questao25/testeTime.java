//25.Escreva uma classe para representar um time de um esporte qualquer em um
//campeonato desse esporte. Que atributos devem ser representados nessa
//classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que
//demonstra as capacidades da classe criada.

// codigo testeado!

public class testeTime {
    
    public static void main(String[] args) {
        Time t1  = new Time();

        t1.inicializaTime("Caio", "Jorge", "Marcio", "Dalila", "Samara", "BlueCrew", "CBLOL"); // incializa o time e campeonato
        t1.mostraTime();                        // mostra a instacia inicial

                System.out.println("\n");         

        t1.substituiJogador("Caio", "Rodrigo"); // substitui caio por rodrigo
        t1.substituiJogador("Samara", "Italo"); // substitui samara por italo
        t1.ganhaPontuacaoTied();                // ganha pontuação de empate
        t1.mostraTime();                        // mostra modificação

                 System.out.println("\n");

        t1.substituiJogador("Cassio", "Gael");  // testa modificação invalida
        
                System.out.println("\n");

        t1.ganhaPontuacaoWin();                 // ganha pontuação de vitoria


        t1.mostraTime();
    
    
    
    }

}
