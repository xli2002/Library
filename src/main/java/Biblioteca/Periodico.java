package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Periodico extends Publicacion {
    private String nombre;
    private Date diaPublicacion;

    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Periodico(String editorial, int paginas, TipoPagina tipoPagina, String nombre, Date diaPublicacion) {
        super(editorial, paginas, tipoPagina);
        this.nombre = nombre;
        this.diaPublicacion = diaPublicacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void altaPeriodico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del editorial:");
        String editorial = scanner.nextLine();
        System.out.println("Ingrese el numero de paginas:");
        int paginas = scanner.nextInt();

        System.out.println("Ingrese el nombre del periodico:");
        String nombre = scanner.next();
        System.out.println("Ingrese la fecha de publicacion del periodico (en formato dd/MM/yyyy):");
        String dia = scanner.next();

        Publicacion nuevoPeriodico = new Periodico(editorial, paginas, tipoPagina(), nombre, new Date(dia));
        publicaciones.add(nuevoPeriodico);
        System.out.println("La publicacion se ha dado de alta correctamente.");
    }

    public static void bajaPeriodico(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del periodico que deseas eliminar: ");
        String nombre = scanner.nextLine();

        boolean periodicoEliminado = false;
        for (int i = 0; i < publicaciones.size(); i++) {
            String periodico = String.valueOf(publicaciones.get(i));
            if (periodico.contains("Periodico: " + nombre)) {
                publicaciones.remove(i);
                periodicoEliminado = true;
                break;
            }
        }

        if (periodicoEliminado) {
            System.out.println("El periodico " + nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("El periodico " + nombre + " no se encontró en la lista.");
        }
    }

    public static void mostrarPeriodico() {
        System.out.println();
        System.out.println("Lista de publicaciones:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.toString());
        }
    }

    @Override
    public String toString() {
        return "Periodico: " + nombre + " dia "+ diaPublicacion;
    }
}
