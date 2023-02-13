package Biblioteca;

public class Libro extends Publicacion {

    private String autor;
    private String titulo;
    private String ISBN;
    private int cantidadEjemplares;
    private String codigoEjemplar;
    private static int contadorEjemplares = 0;
    private boolean prestado;

    public Libro(String editorial, int paginas, TipoPagina tipoPagina, String autor, String titulo, String ISBN, int cantidadEjemplares,int codigoEjemplar) {
        super(editorial, paginas, tipoPagina);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.cantidadEjemplares = cantidadEjemplares;
        contadorEjemplares++;
        this.codigoEjemplar = "EL-" + contadorEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "EjemplarLibro: " + ISBN + codigoEjemplar;
    }
}
