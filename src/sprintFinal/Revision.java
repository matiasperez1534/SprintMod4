package sprintFinal;

public class Revision {
    private String idRevision;
    private String idTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    public Revision() {
    }

    public Revision(String idRevision, String idTerreno, String nombreRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idTerreno = idTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    public String getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(String idRevision) {
        if (idRevision != null && !idRevision.isEmpty()) {
            this.idRevision = idRevision;
        } else {
            System.out.println("ERRRO: Campo obligatorio");
        }
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

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        if (nombreRevision != null && !nombreRevision.isEmpty() && nombreRevision.length() >10 && nombreRevision.length() < 50) {
            this.nombreRevision = nombreRevision;
        } else {
            System.out.println("ERROR: Campo obligatorio");
        }
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        if (detalle.length() < 100) {
            this.detalle = detalle;
        } else {
            System.out.println("ERROR: Máximo 100 caracteres");
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void obtenerEstadoRevision() {
        switch (estado) {
            case 1:
                System.out.println("Estado: Sin problemas");
                break;
            case 2:
                System.out.println("Estado: Con observaciones");
                break;
            case 3:
                System.out.println("Estado: No aprueba");
            default:
                System.out.println("ERRRO: Sistema de salud desconocido");
                break;
        }
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision='" + idRevision + '\'' +
                ", idTerreno='" + idTerreno + '\'' +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
