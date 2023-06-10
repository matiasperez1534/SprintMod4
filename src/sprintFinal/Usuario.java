package sprintFinal;

import java.util.Scanner;
import java.time.LocalDate;


public class Usuario implements IAsesoria {

    private String Nombre;
    private String FechaNacimiento;
    private String RUN;

    public void mostrarDatos(){

    }

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, String RUN) {
        this.Nombre = nombre;
        this.FechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 10 && nombre.length() <= 50) {
            this.Nombre = nombre;
        } else {
            System.out.println("ERROR: Campo obligatorio, mínimo 10 caracteres máximo 50");
        }
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
            this.FechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        int RunValue = Integer.parseInt(RUN);
        if (RunValue >= 0 && RunValue < 99999999) {
            this.RUN = RUN;
        } else {
            System.out.println("ERROR: Campo tiene que ser mayor a 0");
        }
    }

    public String mostrarEdad() {

        // Obtener el año actual
        int anoActual = LocalDate.now().getYear();

        // Obtener el año de nacimiento del usuario
        int anoNacimiento = Integer.parseInt(FechaNacimiento.substring(6));

        // Calcular la edad
        int edad = anoActual - anoNacimiento;

        System.out.println("El usuario tiene " + edad + " años de edad.");

        return "El usuario tiene " + edad + " años";

    }

    public void analizarUsuario() {
        System.out.println("==============================");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Fecha de Nacimiento: " + FechaNacimiento);
        System.out.println("RUN: " + RUN);
    }

    public void agregarUsuarioDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        setNombre(nombre);

        System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();
        setFechaNacimiento(fechaNacimiento);
        mostrarEdad();


        System.out.println("Ingrese su RUN: ");
        String run = scanner.nextLine();
        setRUN(run);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", FechaNacimiento='" + FechaNacimiento + '\'' +
                ", RUN='" + RUN + '\'' +
                '}';
    }
}

