package Biblioteca;

import java.util.ArrayList;

public class Abonado {
    private String nombre;
    private String dni;
    private ArrayList<Ejemplar> ejemplaresPrestados;

    public Abonado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.ejemplaresPrestados = new ArrayList<>();
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



    public ArrayList<Ejemplar> getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(ArrayList<Ejemplar> ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public void prestarEjemplar(Ejemplar ejemplar) {
        if (this.ejemplaresPrestados.size() >= 3) {
            System.out.println("El abonado " + this.nombre + " ya tiene prestados 3 ejemplares y no puede prestar más.");
        } else {
            this.ejemplaresPrestados.add(ejemplar);
            ejemplar.setPrestado(true);
            ejemplar.setAbonado(this);
        }
    }

    public void devolverEjemplar(Ejemplar ejemplar) {
        if (this.ejemplaresPrestados.contains(ejemplar)) {
            this.ejemplaresPrestados.remove(ejemplar);
            ejemplar.setPrestado(false);
            ejemplar.setAbonado(null);
        } else {
            System.out.println("El ejemplar que intenta devolver el abonado " + this.nombre + " no está prestado por él.");
        }
    }
}
