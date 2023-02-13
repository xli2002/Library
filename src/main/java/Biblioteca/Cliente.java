package Biblioteca;

import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String dni;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void eliminarLibroPrestado(Libro libro) {
        librosPrestados.remove(libro);
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public String getNombre() {
        return nombre;
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

    @Override
    public String toString() {
        return "Cliente: " + nombre + " con DNI " + dni;
    }
}

