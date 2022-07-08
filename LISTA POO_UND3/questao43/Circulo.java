public class Circulo extends FiguraGeometrica {
    
    private double raio;


    public Circulo (int lados, double raio){
        super(lados);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void desenha(){
        System.out.println("para desenhar um criculo voce deve usar um compasso para axilio, e o espaço entre as pernas do compasso deve ser o raio");
    }
}
