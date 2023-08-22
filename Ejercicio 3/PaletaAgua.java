public class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, Double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }
 public void MostrarBaseAgua() {
     System.out.println("La base es de Agua?:"+ baseAgua);
     
 }
public void mostrarBaseAgua() {
} 
}