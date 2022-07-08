/*
 43.Crie a classe FiguraGeometrica que possui um método abstrato desenha(). Crie
também as classes Circulo, Quadrado e Triangulo que são subclasses da classe
FiguraGeometrica e implementam o método desenha() apropriado para sua
classe. Por fim, crie uma classe Principal com um método main que cria um
objeto de cada uma das classes e chama seus respectivos métodos desenha().
 */


public class Principal {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(0, 3.0);
        Triangulo t1 = new Triangulo(3, 2, 3);
        Quadrado q1 = new Quadrado(4, 3.0);

        c1.desenha();

        t1.desenha();

        q1.desenha();
    }
}
