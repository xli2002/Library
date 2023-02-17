package Biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Revista extends Publicacion {

    private String nombre;
    private String tematica;
    private Periodicidad periodicidad;
    private Date fechaPublicacion;

    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Revista(String editorial, int paginas, TipoPagina tipoPagina, String nombre, String tematica, Periodicidad periodicidad, Date fechaPublicacion) {
        super(editorial, paginas, tipoPagina);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public static Periodicidad periodicidad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que pericidad tiene? (SEMANAL/MENSUAL/TRIMESTRAL)");
        String periodicidad = scanner.nextLine();
        if (periodicidad.equalsIgnoreCase("TRIMESTRAL"))return Periodicidad.TRIMESTRAL;
        if (periodicidad.equalsIgnoreCase("MENSUAL"))return Periodicidad.MENSUAL;
        return Periodicidad.SEMANAL;
    }

    public static void altaRevista() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del editorial:");
        String editorial = scanner.nextLine();
        System.out.println("Ingrese el numero de paginas:");
        int paginas = scanner.nextInt();
        System.out.println("Ingrese el nombre de la revista:");
        String nombre = scanner.next();
        System.out.println("Ingrese la tematica de la revista:");
        String tematica = scanner.next();
        System.out.println("Ingrese la fecha de publicacion de la revista (en formato dd/MM/yyyy):");
        String fechaPublicacion = scanner.next();

        Publicacion nuevaRevista = new Revista(editorial, paginas, tipoPagina(), nombre, tematica, periodicidad(), new Date(fechaPublicacion));
        publicaciones.add(nuevaRevista);
        System.out.println("La publicacion se ha dado de alta correctamente.");
    }

    public static void bajaRevista(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de la revista que deseas eliminar: ");
        String nombre = scanner.nextLine();

        boolean revistaEliminado = false;
        for (int i = 0; i < publicaciones.size(); i++) {
            String revista = String.valueOf(publicaciones.get(i));
            if (revista.contains("Revista: " + nombre)) {
                publicaciones.remove(i);
                revistaEliminado = true;
                break;
            }
        }

        if (revistaEliminado) {
            System.out.println("La revista " + nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("La revista " + nombre + " no se encontró en la lista.");
        }
    }


    public static void mostrarRevista() {
        System.out.println();
        System.out.println("Lista de publicaciones:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.toString());
        }
    }

    @Override
    public String toString() {
        return "Revista: " + nombre + " de la fecha " +  fechaPublicacion ;
    }
}
