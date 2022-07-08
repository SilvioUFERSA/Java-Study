public class livroBiblioteca extends livro{
    
    private int isbn;
    private String numeroDeChamada;

    public livroBiblioteca(String autor, String titulo, String editora, int volume, int isbn, String numeroDeChamada){
        super(autor, titulo, editora, volume);
        this.isbn = isbn;
        this.numeroDeChamada = numeroDeChamada;
    } 
    
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public void setNumeroDeChamada(String numeroDeChamada){
        this.numeroDeChamada = numeroDeChamada;
    }
    
    public int getIsbn(){
        return this.isbn;
    }
    public String getNumeroDeChamada(){
        return  this.numeroDeChamada;
    }

    @Override
    public String toString (){
        String res = super.toString() +"Isbn: " + isbn + "\n";
        res+= "Numero de Chamada: " + numeroDeChamada + "\n";
        return res;
    }
  
}
