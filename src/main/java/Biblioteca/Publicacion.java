package Biblioteca;

public abstract class Publicacion {
    private String editorial;
    private int paginas;
    private TipoPagina tipoPagina;

    public Publicacion(String editorial, int paginas, TipoPagina tipoPagina) {
        this.editorial = editorial;
        this.paginas = paginas;
        this.tipoPagina = tipoPagina;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public TipoPagina getTipoPagina() {
        return tipoPagina;
    }

    public void setTipoPagina(TipoPagina tipoPagina) {
        this.tipoPagina = tipoPagina;
    }
}


