package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Publicacion {
    private String editorial;
    private int paginas;
    private TipoPagina tipoPagina;

    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Publicacion(String editorial, int paginas, TipoPagina tipoPagina) {
        this.editorial = editorial;
        this.paginas = paginas;
        this.tipoPagina = tipoPagina;
    }

    public static void mostrarPublicaciones() {
        System.out.println();
        System.out.println("Lista de publicaciones:");
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.toString());
        }
    }

    public static TipoPagina tipoPagina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Es de color la pagina? (SI/NO)");
        String tipoPagina = scanner.nextLine();
        if (tipoPagina.equalsIgnoreCase("Si")) return TipoPagina.COLOR;
        return TipoPagina.BLANCO_NEGRO;
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


