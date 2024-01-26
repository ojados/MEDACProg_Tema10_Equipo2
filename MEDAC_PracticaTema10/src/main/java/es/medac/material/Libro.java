/**
 * This class represents a book that extends the material abstract class.
 *
 * @author Anouar Mais
 * @version 1.0
 */
package es.medac.material;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Libro class represents a book in the library system.
 * It extends the Material abstract class and implements the Prestable interface.
 *
 * <p>Each Libro object has an ISBN, title, author, year of publication, number of pages, and a borrowed status.</p>
 *
 * <p>This class provides methods to show specific information about a book, check if the book is borrowed,
 * set and get the number of pages, lend the book, return the book, and a toString method to represent the state of the book.</p>
 *
 * @author Anouar Mais
 * @version 1.0
 * @see Material
 * @see Prestable
 */
public class Libro extends Material {

    private static final Logger LOGGER = Logger.getLogger(Libro.class.getName());

    private int numPages;
    private boolean borrowed;

    public Libro(String isbn, String title, String author, int yearPublication, int numPages) {
        super(isbn, title, author, yearPublication);
        this.numPages = numPages;
        this.borrowed = false;
    }

    public int getNumPages() {
        return numPages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public void prestar() {
        if (isBorrowed()) {
            LOGGER.log(Level.WARNING, "El libro ya está prestado");
        } else {
            borrowed = true;
        }
    }

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
        System.out.println("Muestrando informacion especifica: ");
        System.out.println("Título: " + getTitle());
        System.out.println("Autor: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + getIsbn() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", yearPublication=" + getYearPublication() +
                ", numPages=" + numPages +
                ", borrowed=" + borrowed +
                '}';
}
}
