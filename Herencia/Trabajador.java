public class Trabajador {
    private String nombre;
    private String apelido;
    private Double salario;
    public Trabajador(String nombre, String apelido, Double salario) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", apelido=" + apelido + ", salario=" + salario + "]";
    }

}





















