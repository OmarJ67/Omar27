public class Circulo extends FiguraGeometrica {
    private double radio;
    
    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
