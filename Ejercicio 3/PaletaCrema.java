class PaletaCrema extends Paleta {
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    public void mostrarTexturaCremosa() {
        System.out.println("Tiene textura cremosa: " + cremosa);
    }
    
    @Override
    public void cambiarPrecio(double cantidad) {
        precio += cantidad + 6; // Cambio de precio específico para Paletas Crema
    }

    public void otraFuncionalidad() {
        System.out.println("Esta es una funcionalidad adicional de PaletaCrema.");
    }
}





