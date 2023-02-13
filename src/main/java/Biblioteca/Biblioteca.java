package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Cliente> clientes;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    public void altaPublicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el tipo de publicación que desea dar de alta:");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Periódico");
        int opcion = sc.nextInt();

        Publicacion nuevaPublicacion = null;

        switch(opcion) {
            case 1:
                nuevaPublicacion = new Libro("nose",5,TipoPagina.COLOR,"Juan","Los tomates","dasdasdasd",3,2);
                break;
            case 2:
                nuevaPublicacion = new Revista("nose",5,TipoPagina.COLOR,"Pedro","Fantasia","Mensual",);
                break;
            case 3:
                nuevaPublicacion = new Periodico("nose",5,TipoPagina.COLOR,"Toni","2 febrero");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                return;
        }

        publicaciones.add(nuevaPublicacion);
        System.out.println("La publicación se ha dado de alta correctamente.");
    }

    public void bajaPublicacion(Publicacion publicacion) {
        publicaciones.remove(publicacion);
        System.out.println("La publicación se ha dado de baja correctamente.");
    }

    public void prestarLibro(Libro libro, Cliente cliente) {
        if (libro.getCantidadEjemplares() > 0) {
            cliente.agregarLibroPrestado(libro);
            libro.prestar();
            System.out.println("El libro se ha prestado correctamente.");
        } else {
            System.out.println("Lo sentimos, no hay ejemplares disponibles de este libro.");
        }
    }

    public void devolverLibro(Libro libro, Cliente cliente) {
        if (cliente.getLibrosPrestados()) {
            cliente.eliminarLibroPrestado(libro);
            libro.devolver();
            System.out.println("El libro se ha devuelto correctamente.");
        } else {
            System.out.println("El cliente no tiene prestado este libro.");
        }
    }

    public void altaCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("El cliente se ha dado de alta correctamente.");
    }

    public void bajaCliente(Cliente cliente) {
        clientes.remove(cliente);
        System.out.println("El cliente se ha dado de baja correctamente.");
    }

    public void modificarCliente(Cliente cliente, String nombre,String dni) {
        cliente.setNombre(nombre);
        cliente.setDni(dni);
        System.out.println("Los datos del cliente se han modificado correctamente.");
    }


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Dar de alta publicación");
            System.out.println("2. Dar de baja publicación");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Dar de alta cliente");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Modificar datos de cliente");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            System.out.println();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    biblioteca.altaPublicacion();
                    break;
                case 2:
                    System.out.println("Dar de baja publicación");
                    break;
                case 3:
                    System.out.println("Prestar libro");
                    break;
                case 4:
                    System.out.println("Devolver libro");
                    break;
                case 5:
                    biblioteca.altaCliente(new Cliente(Input.getString());
                    break;
                case 6:
                    System.out.println("Dar de baja cliente");
                    break;
                case 7:
                    System.out.println("Modificar datos de cliente");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 8);
    }
}
