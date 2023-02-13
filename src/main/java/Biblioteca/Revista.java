package Biblioteca;

import java.util.Date;

public class Revista extends Publicacion {

    private String nombre;
    private String tematica;
    private String periodicidad;
    private Date fechaPublicacion;

    public Revista(String editorial, int paginas, TipoPagina tipoPagina, String nombre, String tematica, String periodicidad,Date fechaPublicacion) {
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

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    @Override
    public String toString() {
        return "Revista: " + nombre + fechaPublicacion ;
    }
}
