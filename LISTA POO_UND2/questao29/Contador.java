public class Contador {
    
    private int eventos;    // Aqui eu ja não posso mais atribuir diretamente nenhum valor a minha variável eventos.

    public Contador() {            
       this.eventos = 0;
    }

    public void setZerar () {                                    // use metodo setter 
        eventos = 0;
    }

    public void setIncrementar () {                              // usar metodo getter
        eventos  = eventos + 1;                                  // SET - manipula as tentativas de modificação
    }

    public int getImprimir () {                                 // palavra reservada + TIPO + nome do metodo   
        return eventos;                                         // GET - controlador de dados que são apresentados para o usuário                                 
    }

}

// metodos get e set devem ser publicos por conta que eles são apresentados ao usuário
// e não os PRIVATES
