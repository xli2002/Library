package Biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public void altaPublicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el tipo de publicación que desea dar de alta:");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Periódico");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Libro.altaLibro();
                Libro.mostrarLibro();
                break;
            case 2:
                Revista.altaRevista();
                Revista.mostrarRevista();
                break;
            case 3:
                Periodico.altaPeriodico();
                Periodico.mostrarPeriodico();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public void bajaPublicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el tipo de publicación que desea dar de baja:");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Periódico");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Libro.mostrarLibro();
                Libro.bajaLibro();
                Libro.mostrarLibro();
                break;
            case 2:
                Revista.mostrarRevista();
                Revista.bajaRevista();
                Revista.mostrarRevista();
                break;
            case 3:
                Periodico.mostrarPeriodico();
                Periodico.bajaPeriodico();
                Periodico.mostrarPeriodico();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion ;
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
                    System.out.println();
                    break;
                case 2:
                    biblioteca.bajaPublicacion();
                    System.out.println();
                    break;
                case 3:
                case 4:
                    System.out.println("NO FUNCIONA");
                    System.out.println();
                    break;
                case 5:
                    Cliente.altaCliente();
                    Cliente.mostrarClientes();
                    break;
                case 6:
                    Cliente.mostrarClientes();
                    Cliente.bajaCliente();
                    Cliente.mostrarClientes();
                    break;
                case 7:
                    Cliente.mostrarClientes();
                    Cliente.modificarCliente();
                    Cliente.mostrarClientes();
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
