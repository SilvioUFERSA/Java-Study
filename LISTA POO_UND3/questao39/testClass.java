/* 
39.Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro.
Quais as diferenças entre as duas classes, e que campos elas têm em comum?
Defina os atributos de cada classe e escreva um aplicativo de teste que
demonstre o uso das classes criadas.
*/

// resposta 1 : de diferente , possuem os campos isbm e numero de chamada(serve de referencia para localizar o livro) para a biblioteca,
//              e para a livraria posseui quantidade disponivel e preco. 
// resposta 2 : o que elas tem em comum -> Autor, titulo, editora, volume.


public class testClass {
    public static void main(String[] args) {
        livroBiblioteca livro1 = new livroBiblioteca("Jorge C", "Programacao Orientada a Objetos", "seyLah", 2, 12391283, "200220201");
        livroBiblioteca livro2 = new livroBiblioteca("Valter S", "React Js para inicantes", "Fevereiro", 1, 12310000, "200220305");

        livroLivraria l1 = new livroLivraria("valterS", "ReactJS para Iniciantes", "fevereiro", 1 ,430.55 , 5);
        livroLivraria l2 = new livroLivraria("Sousa S S", "Introducao ao Teste de Software", "j4s", 7 ,398.80 , 2);
        
        System.out.println(livro1);
        System.out.println(livro2);

        System.out.println(l1);
        System.out.println(l2);
    }
}
