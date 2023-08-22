 public class Personaje {
    protected String nombre;
    protected int nivel;
    
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    public void atacar() {
        System.out.println(nombre + " ataca a un objetivo.");
    }
}