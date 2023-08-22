public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
        Triangulo triangulo = new Triangulo(9, 5);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
