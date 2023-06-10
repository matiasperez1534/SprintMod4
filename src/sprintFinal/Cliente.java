package sprintFinal;

import java.util.Scanner;


public class Cliente extends Usuario {

    private String AFP;
    private String Apellido;
    private int sistemaSalud;
    private String Direccion;
    private String Comuna;

    public Cliente() {
    }

    public Cliente(String nombre, String fechaNacimiento, String RUN, String AFP, String apellido, int sistemaSalud, String direccion, String comuna) {
        super(nombre, fechaNacimiento, RUN);
        this.AFP = AFP;
        Apellido = apellido;
        this.sistemaSalud = sistemaSalud;
        Direccion = direccion;
        Comuna = comuna;
    }


    public String obtenerNombre() {
        return getNombre();
    }


    public void obtenerSistemaSalud() {
        switch (sistemaSalud) {
            case 1:
                System.out.println("Sistema de salud: FONASA");
                break;
            case 2:
                System.out.println("Sistema de salud: Isapre");
                break;
            default:
                System.out.println("ERRRO: Sistema de salud desconocido");
                break;
        }
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
    }


    public void mostrarDatos() {
        System.out.println("AFP: " + AFP);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Sistema de salud: " + sistemaSalud + " ==> (1) Fonasa // (2) Isapre");
        System.out.println("Dirección: " + Direccion);
        System.out.println("Comuna: " + Comuna);
    }

    public void setAFP(String AFP) {
        if (AFP.length() >= 4 && AFP.length() <= 30) {
            this.AFP = AFP;
        } else {
            System.out.println("ERROR: Mínimo 4 caracteres, máximo 30 caracteres");
        }
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 5 && apellido.length() < 30) {
            Apellido = apellido;
        } else {
            System.out.println("ERROR: El campo debe tener un minimo de 5 caraceteres.");
        }
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() <= 70) {
            Direccion = direccion;
        } else {
            System.out.println("ERROR: Máximo 70 caracteres");
        }
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String comuna) {
        if (comuna.length() <= 50) {
            Comuna = comuna;
        } else {
            System.out.println("ERROR: Máximo 50 caracteres");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + getNombre() + '\'' +
                ", FechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", RUN='" + getRUN() + '\'' +
                ", AFP='" + AFP + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", Direccion='" + Direccion + '\'' +
                ", Comuna='" + Comuna + '\'' +
                '}';
    }

    @Override
    public void agregarUsuarioDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        super.agregarUsuarioDesdeConsola();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();
        setApellido(apellido);

        System.out.println("Ingrese su AFP: ");
        String afp = scanner.nextLine();
        setAFP(afp);

        System.out.println("Ingrese el tipo de sistema de salud (1: FONASA, 2: Isapre): ");
        int tipoSistemaSalud = scanner.nextInt();
        setSistemaSalud(tipoSistemaSalud);
        obtenerSistemaSalud();
        scanner.nextLine();

        System.out.println("Ingrese su dirección: ");
        String direccion = scanner.nextLine();
        setDireccion(direccion);

        System.out.println("Ingrese su comuna: ");
        String comuna = scanner.nextLine();
        setComuna(comuna);

    }
}


