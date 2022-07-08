public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    
    public Triangulo (int lados, double base, double altura){
        super(lados);
        this.base = base;
        this.altura = altura;
    }



    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void desenha(){
        System.out.println("para desenhar um triangulo, separe os 3 pontos e os ligue por traços");
    }

}
