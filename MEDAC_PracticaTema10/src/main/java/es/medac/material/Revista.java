package es.medac.material;

import es.medac.library.Biblioteca;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Revista extends Material {

    private static final Logger LOGGER = Logger.getLogger(Revista.class.getName());

    private int numArticulos;
    private boolean borrowed;

    public Revista(String isbn, String titulo, String autor, int anioDePublicacion, int numArticulos) {
        super(isbn, titulo, autor, anioDePublicacion);
        this.numArticulos = numArticulos;
        this.borrowed = false;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void prestar() {
        if (isBorrowed()) {
            LOGGER.log(Level.WARNING, "El libro ya está prestado");
        } else {
            LOGGER.log(Level.INFO, Biblioteca.ANSI_CYAN + "{0}" + Biblioteca.ANSI_RESET, this);
            LOGGER.log(Level.INFO, Biblioteca.ANSI_CYAN + "Préstamo realizado." + Biblioteca.ANSI_RESET);
            borrowed = true;
        }
    }

    @Override
    public void devolver() {
        if (!isBorrowed()) {
            LOGGER.log(Level.WARNING, "El libro no está prestado");
        } else {
            LOGGER.log(Level.INFO, Biblioteca.ANSI_CYAN + "{0}" + Biblioteca.ANSI_RESET, this);
            LOGGER.log(Level.INFO, Biblioteca.ANSI_CYAN + "Devolución realizada." + Biblioteca.ANSI_RESET);
            borrowed = false;
        }
    }

    @Override
    public void mostrarInformacionEspecifica() {
        System.out.println("Número de artículos: " + getNumArticulos());
    }

    @Override
    public String toString() {
        return "Revista\n" +
                "\tISBN: " + getIsbn() + "\n" +
                "\tTítulo: " + getTitle() + "\n" +
                "\tAutor: " + getAuthor() + "\n" +
                "\tAño de publicación: " + getYearPublication() + "\n" +
                "\tNúmero de artículos: " + getNumArticulos() + "\n" +
                "\tPrestado: " + (isBorrowed() ? "Sí" : "No") + "\n";
    }
}









