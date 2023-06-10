package sprintFinal;

public class VisitaEnTerreno {

    private String idTerreno;
    private String rutCliente;
    private String fecha;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() {
    }

    public VisitaEnTerreno(String idTerreno, String rutCliente, String fecha, String hora, String lugar, String comentarios) {
        this.idTerreno = idTerreno;
        this.rutCliente = rutCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public String getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(String idTerreno) {
        if (idTerreno != null && !idTerreno.isEmpty()) {
            this.idTerreno = idTerreno;
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
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        if (hora != null && hora.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
            this.hora = hora;
        } else {
            System.out.println("ERROR: Hora inválida");
        }
    }


    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "idTerreno='" + idTerreno + '\'' +
                ", rutCliente='" + rutCliente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
