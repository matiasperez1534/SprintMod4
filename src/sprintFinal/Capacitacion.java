package sprintFinal;

import java.util.Scanner;

public class Capacitacion {

    private String idCapacitacion;

    private String runCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantDeAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(String idCapacitacion, String runCliente, String dia, String hora, String lugar, String duracion, int cantDeAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.runCliente = runCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantDeAsistentes = cantDeAsistentes;
    }



    public String getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(String idCapacitacion) {
        if (idCapacitacion != null && !idCapacitacion.isEmpty()) {
            this.idCapacitacion = idCapacitacion;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getRunCliente() {
        return runCliente;
    }

    public void setRunCliente(String runCliente) {
        if (runCliente != null && !runCliente.isEmpty()) {
            this.runCliente = runCliente;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        if (dia != null && (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
                dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sábado") ||
                dia.equalsIgnoreCase("domingo"))) {
            this.dia = dia;
        } else {
            System.out.println("ERROR: Día inválido");
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (hora != null && hora.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
            this.hora = hora;
        } else {
            System.out.println("ERROR: Hora inválida");
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        if (lugar != null && lugar.length() >= 10 && lugar.length() <= 50) {
            this.lugar = lugar;
        } else {
            System.out.println("ERROR: Lugar inválido, 10 es el minimo de caracteres");
        }
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        if (duracion != null && duracion.length() <= 70) {
            this.duracion = duracion;
        } else {
            System.out.println("ERROR: Duración inválida");
        }
    }

    public int getCantDeAsistentes() {
        return cantDeAsistentes;
    }

    public void setCantDeAsistentes(int cantDeAsistentes) {
        if (cantDeAsistentes >= 0 && cantDeAsistentes < 1000) {
            this.cantDeAsistentes = cantDeAsistentes;
        } else {
            System.out.println("ERROR: Cantidad de asistentes inválida");
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion='" + idCapacitacion + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantDeAsistentes=" + cantDeAsistentes +
                '}';
    }

    public void agregarCapacitacionesDesdeConsola(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese ID: ");
        String id_cap = scanner.nextLine();
        setIdCapacitacion(id_cap);

        System.out.println("Ingrese RUT del Cliente: ");
        String rut = scanner.nextLine();
        setRunCliente(rut);

        System.out.println("Ingrese día: (De Lunes a Domingo)");
        String dia = scanner.nextLine();
        setDia(dia);

        System.out.println("Ingrese hora (formato HH:MM): ");
        String hora = scanner.nextLine();
        setHora(hora);

        System.out.println("Ingrese lugar: ");
        String lugar = scanner.nextLine();
        setLugar(lugar);

        System.out.println("Ingrese duración: ");
        String duracion = scanner.nextLine();
        setDuracion(duracion);

        System.out.println("Ingrese cantidad de asistentes: ");
        int cantidadA = scanner.nextInt();
        setCantDeAsistentes(cantidadA);
    }

    public void analizarCapacitacion(){
        System.out.println("ID: " + idCapacitacion);
        System.out.println("RUT Cliente: " + runCliente);
        System.out.println("Fecha: " + dia + " a las " + hora + ".");
        System.out.println("Lugar: " + lugar + "," + " con una duración de " + duracion + ".");
        System.out.println("Cantidad de asistentes: " + cantDeAsistentes);
    }

    public void mostrarDetalle() {
        String mensaje = "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + ".";
        System.out.println(mensaje);
    }

}
