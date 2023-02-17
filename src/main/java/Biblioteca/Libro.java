package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends Publicacion {
    private String autor;
    private String titulo;
    private String ISBN;
    private int cantidadEjemplares;
    private String codigoEjemplar;

    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Libro(String editorial, int paginas, TipoPagina tipoPagina, String autor, String titulo, String ISBN, int cantidadEjemplares, String codigoEjemplar) {
        super(editorial, paginas, tipoPagina);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.cantidadEjemplares = cantidadEjemplares;
        this.codigoEjemplar = codigoEjemplar;
    }

    public static void altaLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del editorial:");
        String editorial = scanner.nextLine();
        int paginas = Input.getInteger("Ingrese el numero de paginas:");
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.next();
        System.out.println("Ingrese el titulo del libro:");
        String titulo = scanner.next();
        System.out.println("Ingrese el ISBN del libro:");
        String ISBN = scanner.next();
        int cantidad = Input.getInteger("Ingrese la cantidad de ejemplares:");
        System.out.println("Ingrese el codigo del ejemplar:");
        String codigo = scanner.next();

        Publicacion nuevoLibro = new Libro(editorial, paginas, tipoPagina(), autor, titulo, ISBN, cantidad, codigo);
        publicaciones.add(nuevoLibro);
        System.out.println("La publicacion se ha dado de alta correctamente.");
    }

    public static void bajaLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el título del libro que deseas eliminar: ");
        String titulo = scanner.nextLine();

        boolean libroEliminado = false;
        for (int i = 0; i < publicaciones.size(); i++) {
            String libro = String.valueOf(publicaciones.get(i));
            if (libro.contains("Libro: " + titulo)) {
                publicaciones.remove(i);
                libroEliminado = true;
                break;
            }
        }

        if (libroEliminado) {
            System.out.println("El libro " + titulo + " ha sido eliminado de la lista.");
        } else {
            System.out.println("El libro " + titulo + " no se encontró en la lista.");
        }
    }

    public static void mostrarLibro() {
        System.out.println();
        System.out.println("Lista de publicaciones:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.toString());
        }
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " con el ISBN: " + ISBN + " y con el codigo: " + codigoEjemplar;
    }
}
