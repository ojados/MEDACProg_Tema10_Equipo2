package es.medac.material;

import es.medac.miscellany.Colors;

import java.util.logging.Level;

import static es.medac.miscellany.LogLibrary.LOGGER;

/**
 * The {@code Revista} class represents a magazine in the library system.
 *
 * <p>This class extends the {@code Material} abstract class and implements the {@code Prestable} interface. It represents a magazine with properties such as number of articles and borrowed status.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Revista revista = new Revista("123456", "Java Magazine", "John Doe", 2020, 10);
 *     revista.prestar();
 *     revista.devolver();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Material
 * @see Prestable
 * @see Libro
 *
 * @author David Quiroga (19JuanDavid)
 *
 * @version 1.0
 */
public class Revista extends Material {

    /**
     * The number of articles in the magazine.
     */
    private int numArticulos;

    /**
     * The borrowed status of the magazine.
     */
    private boolean borrowed;

    /**
     * Constructs a new magazine with the specified ISBN, title, author, year of publication, and number of articles.
     *
     * @param isbn the ISBN of the magazine
     * @param title the title of the magazine
     * @param author the author of the magazine
     * @param yearPublication the year of publication of the magazine
     * @param numArticulos the number of articles in the magazine
     */
    public Revista(String isbn, String title, String author, int yearPublication, int numArticulos) {
        super(isbn, title, author, yearPublication);
        this.numArticulos = numArticulos;
        this.borrowed = false;
    }

    /**
     * Returns the number of articles in the magazine.
     *
     * @return the number of articles in the magazine
     */
    public int getNumArticulos() {
        return numArticulos;
    }

    /**
     * Sets the number of articles in the magazine.
     *
     * @param numArticulos the new number of articles in the magazine
     */
    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }

    /**
     * Returns the borrowed status of the magazine.
     *
     * @return the borrowed status of the magazine
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Borrows the magazine.
     *
     * <p>This method sets the borrowed status of the magazine to true.</p>
     */
    @Override
    public void prestar() {
        if (isBorrowed()) {
            LOGGER.log(Level.WARNING, "El libro ya está prestado");
        } else {
            borrowed = true;
        }
    }

    /**
     * Returns the magazine.
     *
     * <p>This method sets the borrowed status of the magazine to false.</p>
     */
    @Override
    public void devolver() {
        if (!isBorrowed()) {
            LOGGER.log(Level.WARNING, "El libro no está prestado");
        } else {

            borrowed = false;
        }
    }

    /**
     * Shows specific information about the magazine.
     */
    @Override
    public void mostrarInformacionEspecifica() {
        LOGGER.log(Level.INFO, Colors.ANSI_BLUE);
        LOGGER.log(Level.INFO, "Mostrando información específica de la revista:");
        LOGGER.log(Level.INFO, "Título: {}", getTitle());
        LOGGER.log(Level.INFO, "Autor: {}", getAuthor());
        LOGGER.log(Level.INFO, "ISBN: {}", getIsbn());
        LOGGER.log(Level.INFO, "Año de publicación: {}", getYearPublication());
        LOGGER.log(Level.INFO, "Número de artículos: {}", getNumArticulos());
        LOGGER.log(Level.INFO, "Prestado: {}", (isBorrowed() ? "Sí" : "No"));
        LOGGER.log(Level.INFO, Colors.ANSI_RESET);
    }

    /**
     * Returns a string representation of the magazine.
     *
     * @return a string representation of the magazine
     */
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









