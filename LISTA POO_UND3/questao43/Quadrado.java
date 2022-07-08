public class Quadrado extends FiguraGeometrica{

    private double tamLado;


    public Quadrado (int lados, double tamLado){
        super(lados);
        this.tamLado= tamLado;
    }

    public double getTamLado() {
        return tamLado;
    }
    public void setTamLado(double tamLado) {
        this.tamLado = tamLado;
    }

    public void desenha() {
        System.out.println("para desenhar um quadrado, disponha 4 pontos separados e ligue os pontos de forma e que os tracos que liga os pontos tenham o mesmo tamanho.");
    }
}
