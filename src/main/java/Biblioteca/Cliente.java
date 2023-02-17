package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String dni;
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static void altaCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del nuevo cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el DNI del nuevo cliente:");
        String dni = scanner.nextLine();
        Cliente nuevoCliente = new Cliente(nombre, dni);
        clientes.add(nuevoCliente);
        System.out.println("El cliente se ha dado de alta correctamente.");
    }

    public static void bajaCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente que desea dar de baja:");
        String dni = scanner.nextLine();
        boolean clienteEncontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                clientes.remove(cliente);
                System.out.println("El cliente con DNI " + dni + " ha sido dado de baja.");
                clienteEncontrado = true;
                break;
            }
        }
        if (!clienteEncontrado) {
            System.out.println("No se encontró un cliente con DNI: " + dni);
        }
    }

    public static void modificarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente que desea modificar:");
        String dni = scanner.nextLine();
        boolean clienteEncontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                System.out.println("Cliente encontrado: " + cliente.toString());
                System.out.println("Ingrese el nuevo nombre del cliente:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo DNI del cliente:");
                String nuevoDni = scanner.nextLine();
                cliente.setNombre(nombre);
                cliente.setDni(nuevoDni);
                System.out.println("El cliente ha sido modificado correctamente.");
                clienteEncontrado = true;
                break;
            }
        }
        if (!clienteEncontrado) {
            System.out.println("No se encontró un cliente con DNI: " + dni);
        }
    }


    public static void mostrarClientes() {
        System.out.println();
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " DNI: " + dni;
    }
}

