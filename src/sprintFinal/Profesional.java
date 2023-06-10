package sprintFinal;

import java.util.Scanner;

public class Profesional extends Usuario{

    private String Titulo;
    private String fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, String fechaNacimiento, String RUN, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, RUN);
        Titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty() && titulo.length() > 10 && titulo.length() < 50) {
            Titulo = titulo;
        } else {
            System.out.println("ERROR: Campo obligatorio, minímo 10 y máximo 50 caracteres");
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        //System.out.println("Título: " + Titulo);
        //System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + Titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "Titulo='" + Titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override
    public void agregarUsuarioDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        super.agregarUsuarioDesdeConsola();

        System.out.println("Ingresar titulo: ");
        String titulo = scanner.nextLine();
        setTitulo(titulo);

        System.out.println("Ingresar fecha de ingreso (DD/MM/AAAA): ");
        String fechaIngreso = scanner.nextLine();
        setFechaIngreso(fechaIngreso);
    }
}
