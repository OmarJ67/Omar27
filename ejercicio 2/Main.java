public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Omar", 10, "Guerrero");
        jugador.atacar();
        jugador.usarHabilidadEspecial();
        
        Enemigo enemigo = new Enemigo("Orco Vengador", 8, "Orco");
        enemigo.atacar();
        enemigo.gritar();
    }
}
