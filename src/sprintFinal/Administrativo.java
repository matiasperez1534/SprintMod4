package sprintFinal;

import java.util.Scanner;

public class Administrativo extends Usuario {

    private String Area;
    private String expPrevia;

    public Administrativo() {
    }

    public Administrativo(String area, String expPrevia) {
        Area = area;
        this.expPrevia = expPrevia;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        if (area.length() > 5 && area.length() < 50) {
            Area = area;
        } else {
            System.out.println("ERROR: Mínimo 5 y máximo 50 caracteres ");
        }
    }
    public String getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(String expPrevia) {
        if (expPrevia.length() < 1500) {
            this.expPrevia = expPrevia;
        } else {
            System.out.println("ERROR: Máximo 1500 caracteres");
        }
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "Area='" + Area + '\'' +
                ", expPrevia='" + expPrevia + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        //System.out.println("Área: " + Area);
        //System.out.println("Experiencia previa:" + expPrevia);
    }

    public void mostrarDatos() {
        System.out.println("Area: " + Area);
        System.out.println("Experiencia previa: " + expPrevia);
    }

    @Override
    public void agregarUsuarioDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        super.agregarUsuarioDesdeConsola();

        System.out.println("Ingresar área: ");
        String area = scanner.nextLine();
        setArea(area);

        System.out.println("Ingresar experiencia previa:");
        String exp_previa = scanner.nextLine();
        setExpPrevia(exp_previa);
    }
}
