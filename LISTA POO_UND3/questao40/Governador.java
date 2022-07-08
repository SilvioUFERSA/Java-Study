public class Governador extends politico { // herda de politico
    
    private String governadorDe;
    private int numero;


    public Governador (String nome, String cpf, int idade, String partidoPolitico, 
    String governadorDe, int numero ){

       super(nome, cpf, idade, partidoPolitico);
       this.governadorDe = governadorDe;
       this.numero = numero; 

    }

    public void setGovernadorDe(String governadorDe) {
        this.governadorDe = governadorDe;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getGovernadorDe() {
        return governadorDe;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        String res;
        res = super.toString() + "Numero do Candidato: " + numero + "\n";
        res += "Governador do Estado de: " + governadorDe + "\n";
        return res;
    }
}
