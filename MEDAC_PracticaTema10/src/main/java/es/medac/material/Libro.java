/**
 * This class represents a book that extends the material abstract class.
 *
 * @author Anouar Mais
 * @version 1.0
 */
package es.medac.material;

import es.medac.miscellany.Colors;

import java.util.logging.Level;

import static es.medac.miscellany.LogLibrary.LOGGER;

/**
 * The {@code Libro} class represents a book in the library system.
 *
 * <p>This class extends the {@code Material} abstract class and implements the
 * {@code Prestable} interface. It represents a book with properties such as
 * number of pages and borrowed status.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Libro libro = new Libro("123456", "Java Programming", "John Doe", 2020, 500);
 *     libro.prestar();
 *     libro.devolver();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Material
 * @see Prestable
 * @see Revista
 *
 * @author Anouar Mais (Anouarmais)
 *
 * @version 1.0
 */
public class Libro extends Material {

    /**
     * The number of pages in the book.
     */
    private int numPages;

    /**
     * The borrowed status of the book.
     */
    private boolean borrowed;

    /**
     * Constructs a new book with the specified ISBN, title, author, year
     * of publication, and number of pages.
     *
     * @param isbn the ISBN of the book
     * @param title the title of the book
     * @param author the author of the book
     * @param yearPublication the year of publication of the book
     * @param numPages the number of pages in the book
     */
    public Libro(String isbn, String title, String author, int yearPublication, int numPages) {
        super(isbn, title, author, yearPublication);
        this.numPages = numPages;
        this.borrowed = false;
    }

    /**
     * Returns the number of pages in the book.
     *
     * @return the number of pages in the book
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * Sets the number of pages in the book.
     *
     * @param numPages the new number of pages in the book
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    /**
     * Returns the borrowed status of the book.
     *
     * @return the borrowed status of the book
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Sets the borrowed status of the book.
     *
     * @param borrowed the new borrowed status of the book
     */
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    /**
     * Borrows the book.
     *
     * <p>This method sets the borrowed status of the book to true.</p>
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
     * Returns the book.
     *
     * <p>This method sets the borrowed status of the book to false.</p>
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
     * Shows specific information about a book
     */
    @Override
    public void mostrarInformacionEspecifica() {
        LOGGER.log(Level.INFO, Colors.ANSI_BLUE);
        LOGGER.log(Level.INFO, "Mostrando información específica del libro:");
        LOGGER.log(Level.INFO, "Título: {}", getTitle());
        LOGGER.log(Level.INFO, "Autor: {}", getAuthor());
        LOGGER.log(Level.INFO, "ISBN: {}", getIsbn());
        LOGGER.log(Level.INFO, "Año de publicación: {}", getYearPublication());
        LOGGER.log(Level.INFO, "Número de páginas: {}", getNumPages());
        LOGGER.log(Level.INFO, "Prestado: {}", (isBorrowed() ? "Sí" : "No"));
        LOGGER.log(Level.INFO, Colors.ANSI_RESET);
    }

    /**
     * Returns a string representation of the book.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Libro\n" +
                "\tISBN: " + getIsbn() + "\n" +
                "\tTítulo: " + getTitle() + "\n" +
                "\tAutor: " + getAuthor() + "\n" +
                "\tAño de publicación: " + getYearPublication() + "\n" +
                "\tNúmero de páginas: " + getNumPages() + "\n" +
                "\tPrestado: " + (isBorrowed() ? "Sí" : "No") + "\n";
    }
}
