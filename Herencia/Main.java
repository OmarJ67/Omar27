import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        // Crear trabajadores y agregarlos a la lista
        listaTrabajadores.add(new Obrero("Juan", "Pérez", 2500.0));
        listaTrabajadores.add(new Obrero("María", "López", 2800.0));
        listaTrabajadores.add(new Supervisor("Carlos", "González", 2200.0));
        listaTrabajadores.add(new Supervisor("Ana", "Martínez", 3000.0));
        listaTrabajadores.add(new Gerente("Luis", "Rodríguez", 2600.0));
        listaTrabajadores.add(new Gerente("Laura", "Hernández", 2400.0));
        listaTrabajadores.add(new Obrero("Pedro", "Ramírez", 2700.0));
        listaTrabajadores.add(new Supervisor("Sofía", "Díaz", 2900.0));

        // Imprimir la lista de trabajadores y sus pagos
        for (Trabajador trabajador : listaTrabajadores) {
            System.out.println(trabajador);
        }
    }
}

