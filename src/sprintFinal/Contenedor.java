package sprintFinal;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    private List<IAsesoria> usuarios = new ArrayList<>();
    private List<Capacitacion> capacitacion = new ArrayList<>();

    public Contenedor() {
    }

    public void addUsuarios(IAsesoria usuario) {
        usuarios.add(usuario);
    }

    public void addCapacitacion (Capacitacion capacitaciones){
        capacitacion.add(capacitaciones);
    }

    public void mostrarUsuarios() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }
    
    public void mostrarCapacitaciones(){
        for (Capacitacion capacitaciones : capacitacion){
            capacitaciones.analizarCapacitacion();
            System.out.println();
        }
    }
    //Probando codigo para que coicidan cliente con capacitaciones.-
    public void listarCapacitacionesConCliente() {
        for (Capacitacion capacitacion : capacitacion) {
            String idCapacitacion = capacitacion.getIdCapacitacion();
            String runCliente = capacitacion.getRunCliente();

            Cliente cliente = buscarClientePorRUN(runCliente);
            if (cliente != null) {
                System.out.println("Datos de capacitaciones");
                System.out.println("ID de Capacitación: " + idCapacitacion);
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("RUT Cliente: " + cliente.getRUN());
                System.out.println("Fecha: " + "Es el día " + capacitacion.getDia() + " a las " + capacitacion.getHora());
                System.out.println("En el lugar " + capacitacion.getLugar() + ", con " + capacitacion.getDuracion() + " de duración.");
                System.out.println("Cantidad de asistentes: " + capacitacion.getCantDeAsistentes());
                cliente.mostrarDatos();
                System.out.println();
            }
        }
    }

    public Cliente buscarClientePorRUN(String runCliente) {
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;
                if (cliente.getRUN().equals(runCliente)) {
                    return cliente;
                }
            }
        }
        return null;
    }

    public Usuario buscarRUT(String run) {
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Usuario) {
                Usuario usuarioBuscar = (Usuario) usuario;
                if (usuarioBuscar.getRUN().equals(run)) {
                    return usuarioBuscar;
                }
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String run) {
        Usuario usuarioEliminar = buscarRUT(run);
        if (usuarioEliminar != null) {
            usuarios.remove(usuarioEliminar);
            return true;
        }
        return false;
    }
    // Metodos para mostrar el tipo de usuario.-
    public void listarUsuariosPorTipo(String tipoUsuario) {
        for (IAsesoria usuario : usuarios) {
            if (esTipoUsuario(usuario, tipoUsuario)) {
                usuario.analizarUsuario();
                System.out.println();
            }
        }
    }

    private boolean esTipoUsuario(IAsesoria usuario, String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
            return true;
        } else if (tipoUsuario.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
            return true;
        } else if (tipoUsuario.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
            return true;
        }
        return false;
    }

    public void mostrarDatos(String tipoUsuario) {
        for (IAsesoria usuario : usuarios) {
            if (esTipoUsuario(usuario, tipoUsuario)) {
                usuario.analizarUsuario();
                if (usuario instanceof Cliente) {
                    Cliente cliente = (Cliente) usuario;
                    cliente.mostrarDatos();
                }
                if (usuario instanceof Profesional) {
                    Profesional profesional = (Profesional) usuario;
                    profesional.mostrarDatos();
                }
                if (usuario instanceof Administrativo) {
                    Administrativo administrativo = (Administrativo) usuario;
                    administrativo.mostrarDatos();
                }

            }
        }
    }


}
