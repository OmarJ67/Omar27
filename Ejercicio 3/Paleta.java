public class Paleta {
    private String sabor;
    protected Double precio;
    public Paleta(String sabor, Double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }
    public void mostrarInformacion() {
    System.out.println("Sabor:" + sabor);
    System.out.println("Precio:" + precio);
    }
    public void cambiarPrecio(double cantidad) {
        precio += cantidad;
    }

}