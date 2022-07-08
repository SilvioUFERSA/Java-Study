public class Pessoa { // raiz
    
    private String nome;    // toda pessoa tem um nome
    private String cpf;     // tem um cpf
    private int idade;    // e tem uma idade

    public Pessoa (String nome, String cpf, int idade){ // contructor da classe
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //getters e setters

    public void serNome(String nome){
        this.nome = nome;
    }
    public void setCpf( String cpf){
        this.cpf = cpf;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }

    public String getNome (){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString (){
        String res = "Nome: " + nome + "  Idade: " + idade + "  cpf: " + cpf + "\n";
        return res;
    }
}
