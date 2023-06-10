package sprintFinal;

import java.util.Scanner;

public class Menu {

    private Contenedor contenedor;

    public Menu() {
        contenedor = new Contenedor();
    }

    public void menuPrincipal() {
        int op;

        do {
            muestraMenu();
            System.out.println("Selecciona la opción del menú: ");
            op = opcionDeMenu();
            switch (op) {
                //case 1: {
                    //Usuario usuario = new Usuario();
                   // usuario.agregarUsuarioDesdeConsola();
                   // contenedor.addUsuarios(usuario);
                    //System.out.println("Agregaste usuario correctamente!");
                   // break;
                //}
                case 1: {
                    Cliente cliente = new Cliente();
                    cliente.agregarUsuarioDesdeConsola();
                    contenedor.addUsuarios(cliente);
                    System.out.println();
                    break;
                }

                case 2: {
                    Profesional profesional = new Profesional();
                    profesional.agregarUsuarioDesdeConsola();
                    contenedor.addUsuarios(profesional);
                    System.out.println();
                    break;
                }

                case 3: {
                    Administrativo administrativo = new Administrativo();
                    administrativo.agregarUsuarioDesdeConsola();
                    contenedor.addUsuarios(administrativo);
                    System.out.println();
                    break;
                }

                case 4: {
                    Capacitacion capacitacion = new Capacitacion();
                    capacitacion.agregarCapacitacionesDesdeConsola();
                    contenedor.addCapacitacion(capacitacion);
                    capacitacion.mostrarDetalle();
                    break;
                }

                case 5: {
                    System.out.println("Ingrese el RUN del usuario que desea eliminar: ");
                    String run = opcionDeMenuString();
                    boolean eliminado = contenedor.eliminarUsuario(run);
                    if (eliminado) {
                        System.out.println("Usuario eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún usuario con el RUN proporcionado.");
                    }
                    break;
                }


                case 6: {
                    System.out.println("");
                    contenedor.mostrarUsuarios();
                    System.out.println("");
                    break;
                }

                case 7: {
                    System.out.println("Ingrese el tipo de usuario (cliente, profesional o administrativo):");
                    String tipoUsuario = opcionDeMenuString();
                    contenedor.mostrarDatos(tipoUsuario);
                    break;
                }


                case 8: {
                    System.out.println("");
                    contenedor.listarCapacitacionesConCliente();
                    System.out.println("");
                    break;
                }

                case 0: {
                    System.out.println("Saliendo del Menú principal");
                    break;
                }

                default: {
                    System.out.println("ERROR: Ingreso de la opción incorrecta");
                }
            }
        } while (op != 0);
    }

    public void muestraMenu() {
        System.out.println("===========================");
        System.out.println(" MENÚ PRINCIPAL");
        System.out.println("---------------------------");
        System.out.println("1.- Almacenar Clientes");
        System.out.println("2.- Almacenar Profesionales");
        System.out.println("3.- Almacenar Administrativos");
        System.out.println("4.- Almacenar Capacitación");
        System.out.println("5.- Eliminar Usuario");
        System.out.println("6.- Listar Usuarios");
        System.out.println("7.- Listar Usuarios por tipo");
        System.out.println("8.- Listar Capacitaciones");
        System.out.println("0.- Salir");
        System.out.println("---------------------------");
    }

    public int opcionDeMenu() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public String opcionDeMenuString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

}


