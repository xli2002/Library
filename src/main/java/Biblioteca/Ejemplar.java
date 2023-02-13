package Biblioteca;

import java.time.LocalDate;
public class Ejemplar {
    private boolean prestado;
    private Abonado abonado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Ejemplar() {
        this.prestado = false;
        this.abonado = null;
        this.fechaPrestamo = null;
        this.fechaDevolucion = null;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
