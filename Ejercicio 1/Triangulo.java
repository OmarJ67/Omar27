public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
