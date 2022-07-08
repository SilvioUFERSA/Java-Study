public abstract class FiguraGeometrica {
    
    protected int lados; //circulo tem 0 lados, triangulo 3, quandrado 4.
    
    public FiguraGeometrica( int lados){
        this.lados= lados;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public abstract void desenha(); // aqui deve ser abstract , pois cada figura é desenhada de forma diferente.

}
