package sprintFinal;

public class Accidente {

    private String idAccidente;
    private String rutCliente;
    private String fecha;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencia;

    public Accidente() {
    }

    public Accidente(String idAccidente, String rutCliente, String fecha, String hora, String lugar, String origen, String consecuencia) {
        this.idAccidente = idAccidente;
        this.rutCliente = rutCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencia;
    }

    public String getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(String idAccidente) {
        if (idAccidente != null && !idAccidente.isEmpty()) {
            this.idAccidente = idAccidente;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        if (rutCliente != null && !rutCliente.isEmpty()) {
            this.rutCliente = rutCliente;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        if (lugar != null && !lugar.isEmpty() && lugar.length() > 10 && lugar.length() < 50) {
            this.lugar = lugar;
        } else {
            System.out.println("ERROR: Campo obligatorio, 10 caracteres como mínimo");
        }
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        if (origen.length() < 100) {
            this.origen = origen;
        } else {
            System.out.println("ERROR: Máximo 100 caracteres");
        }
    }

    public String getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(String consecuencia) {
        if (consecuencia.length() < 100) {
            this.consecuencia = consecuencia;
        } else {
            System.out.println("ERROR: Máximo 100 caracteres");
        }
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente='" + idAccidente + '\'' +
                ", rutCliente='" + rutCliente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                '}';
    }
}
