public class politico extends Pessoa{ // herda de pessoa
    
    private String partidoPolitico;

    public politico(String nome, String cpf, int idade, String partidoPolitico){
        super(nome, cpf, idade);
        this.partidoPolitico = partidoPolitico;
    }

    public void setPartidoPolitico( String partidoPolitico){
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico(){
        return this.partidoPolitico;
    }

    @Override // sobrescrevendo a classe filha 
    public String toString (){
        String res = super.toString() + "Partido: " + partidoPolitico + "\n" ;
        return res;
    }
}
