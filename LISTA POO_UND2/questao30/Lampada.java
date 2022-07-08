public class Lampada {
    
    private boolean estadoDaLampada;    // (true(1))-ligada  (false(0))-desligada
    private int eventos;                // meu contador que conta os eventos em que a Luz passa de apagada para ascesa.

    public Lampada(){
        this.eventos = 0;                   // utilização da lógica e instãncia da questão passada
        this.estadoDaLampada = false;       // lamapada começa desligada
    }
    
    public boolean acende (){
        if(estadoDaLampada == false){           // se minha lampada está apagada, o estado muda para acesa
            this.eventos = this.eventos + 1;    // indica quantas vezes minha lampada foi acesa.
            return estadoDaLampada = true;
        } else{
            return estadoDaLampada = true;      // se ela está acesa eu não posso acender o que já está aceso
        }
    }

    public boolean apaga (){
        if(estadoDaLampada == true){       // se a Lampada estiver acesa, ela muda de estado. 
            return estadoDaLampada = false;
        } else{
            return estadoDaLampada = false; // se a lampada estiver apagada, eu não posso apagar o que já está apagado
        }
    }

    private boolean estaLigada () {         //private por conta que o usuário não acessa esse metodo.
        if(estadoDaLampada == true){        //a partir desse metodo meu estado é gerado.
            return true; // ligada
        } else {
            return false; // desligada
        }
    }

    public void mostraEstado (){            // recebe o retorno do metodo estaLigado()
        if(estaLigada() == true){
            System.out.println("lampada esta acesa."); 
        }else{
            System.out.println("lampada esta apagada.");
        }
    }

    public int getMostraContador(){         // get - pega meu dado Private, para poder imprimi-lo.
        return eventos;
    }
}
