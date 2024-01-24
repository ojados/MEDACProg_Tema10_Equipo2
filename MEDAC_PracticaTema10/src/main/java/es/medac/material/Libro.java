/**
 * This class represents a book that extends the material abstract class.
 *
 * @author Anouar Mais
 * @version 1.0
 */
package es.medac.material;
import java.time.LocalDate;

public class Libro extends Material {

    //Atributos de la clase Libro
    private int numPages;
    private  boolean borrowed = false;

    /**
     * Constructor de la clase libros con parametros
     * @param ISBN The identification number of the book.
     * @param titulo The title of the book.
     * @param autor The author of the book.
     * @param anioDePublicacion The year the book was published.
     * @param numPages The number of pages in the book.
     */
    public Libro(String ISBN, String titulo, String autor, LocalDate anioDePublicacion , int numPages) {
        super(ISBN, titulo, autor, anioDePublicacion );

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
    /**
     * Returns the loan status of the book.
     *
     * @return true if the book is checked out, false if it is not checked out.
     */
    public boolean isBorrowed() {
        return borrowed;
    }
    /**
     * Set the number of pages in the book.
     *
     * @param numPages The number of pages to set.
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    /**
     * Gets the number of pages of the book.
     *
     * @return The number of pages in the book.
     */

    public int getNumPages() {
        return numPages;
    }
    /**
     * Implementation of the Prestable interface method to lend the book.
     */

    @Override
    public void prestar() {
    borrowed = true;
    }
    /**
     * Implementation of the Prestable interface method to return the book.
     */
    @Override
    public void devolver() {
        borrowed = false;

    }
    /**
     * String format representation of the book information.
     *
     * @return A string representing the state of the workbook.
     */
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
