// atribuitos: CAPEONATO, TIME, PONTOS, JOGADORES
// METODOS: INCIALIZA ATRIBUTOS; GANHA PONTUAÇÃO DE EMPATE, GANHA PONTUAÇÃO DE VITORIA, SUBSTITUI JOGADORES, MOSTRA STATUS DO TIME


public class Time {
    
    String nomeCampeonato;
    String nomeTime;
    int pontos = 0 ;

    String jogador1;
    String jogador2;
    String jogador3;
    String jogador4;
    String jogador5;

    void inicializaTime(String j1, String j2, String j3, String j4, String j5, String nTime, String nCampeonato){      //instancia incial
        
        nomeCampeonato = nCampeonato;
        nomeTime = nTime;
        jogador1 = j1;
        jogador2 = j2;
        jogador3 = j3;
        jogador4 = j4;
        jogador5 = j5;

        
    }

    public int ganhaPontuacaoWin(){
        return this.pontos = pontos + 3;
    }

    public int ganhaPontuacaoTied(){
        return this.pontos = pontos + 1;
    }

    public void mostraTime(){ // listagem de jogadores

        System.out.println("Campeonato: " + nomeCampeonato);
        System.out.println("Time: " + nomeTime);
        System.out.println("Pontuacao: " + pontos);

        System.out.println("Jogador 1: " + jogador1);
        System.out.println("Jogador 2: " + jogador2);
        System.out.println("Jogador 3: " + jogador3);
        System.out.println("Jogador 4: " + jogador4);
        System.out.println("Jogador 5: " + jogador5);
    }

    public void substituiJogador( String titular, String substituto ){  // comparo meu candidato a titular com meus jogadores titulares, se existir ocorre a substituição
        if ( titular == jogador1 ){
            jogador1 = substituto;
        }
        else if (titular == jogador2){
            jogador2 = substituto;
        }
        else if (titular == jogador3){
            jogador3 = substituto;
        }
        else if (titular == jogador4){
            jogador4 = substituto;
        }
        else if (titular == jogador5){
            jogador5 = substituto;
        }else{
            System.out.println("Opcao invalida! Tente novamente! ");
        }
    }
}
