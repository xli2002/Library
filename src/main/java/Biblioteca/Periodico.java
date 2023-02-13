package Biblioteca;

public class Periodico extends Publicacion {
    private String nombre;
    private String diaPublicacion;

    public Periodico(String editorial, int paginas, TipoPagina tipoPagina, String nombre, String diaPublicacion) {
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

    public String getDiaPublicacion() {
        return diaPublicacion;
    }

    public void setDiaPublicacion(String diaPublicacion) {
        this.diaPublicacion = diaPublicacion;
    }

    @Override
    public String toString() {
        return "Periodico: " + nombre + diaPublicacion;
    }
}
