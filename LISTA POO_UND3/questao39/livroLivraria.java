public class livroLivraria extends livro {
    
    private double preco;
    private int quantidadeDisponivel;

    public livroLivraria(String autor, String titulo, String editora, int volume, double preco, int quantidadeDisponivel){
        super(autor, titulo, editora, volume);
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setPreco( double preco){
        this.preco = preco;
    }
    public void setQuantidadeDisponivel ( int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double getPreco (){
        return preco;
    }
    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    @Override
    public String toString(){
        String res = super.toString() + "Quantidade: " + quantidadeDisponivel + "\n";
        res += "Preco: " + preco + "\n";
        return res;
    }
}
