public class livro {

    private String autor;
    private String titulo;
    private String editora;
    private int volume;

    public livro(String autor, String titulo, String editora, int volume){
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.volume = volume;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setVolumo(int volume){
        this.volume = volume;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditora() {
        return editora;
    }
    public int volume(){
        return volume;
    }

    @Override
    public String toString() {
        String res = "Titulo: " + titulo + "\n";
        res += "Autor: " + autor + "\n";
        res += "Volume: " + volume + "\n";
        res += "Editora: " + editora + "\n";
        return res;
    }

    
}
