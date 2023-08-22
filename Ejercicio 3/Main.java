public class Main {
    public static void main(String[] args) {
        PaletaAgua paletaAgua = new PaletaAgua("Chocolate", 25.0, false);
        paletaAgua.mostrarInformacion();
        paletaAgua.mostrarBaseAgua();
        paletaAgua.cambiarPrecio(2.0);
        paletaAgua.mostrarInformacion();
        System.out.println();

        PaletaCrema paletaCrema = new PaletaCrema("Vainilla", 12.0, true);
        paletaCrema.mostrarInformacion();
        paletaCrema.mostrarTexturaCremosa();
        paletaCrema.cambiarPrecio(6.0);
        paletaCrema.mostrarInformacion();
        paletaCrema.otraFuncionalidad();
    }
}


