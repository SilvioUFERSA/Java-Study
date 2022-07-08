public class Prefeito extends politico { // herda de politco
    
    private String prefeitoDe;
    private int numero;

   
    public Prefeito(String nome, String cpf, int idade, 
                    String partidoPolitico, String prefeitoDe, int numero ){
        
        super (nome, cpf, idade, partidoPolitico);
        this.prefeitoDe = prefeitoDe;
        this.numero = numero;
    }

    public void setPrefeitoDe( String prefeitoDe){
        this.prefeitoDe = prefeitoDe;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPrefeitoDe (){
        return prefeitoDe;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString (){
        String res = super.toString() + "numero do Candidato: " + numero + "\n";
        res +="Prefeito da Cidade de: " + prefeitoDe +"\n";
        return res;
    }

}
