package es.medac.material;

/**
 * The {@code Material} class is an abstract class that represents a generic
 * material in the library system.
 *
 * <p>This class implements the {@code Prestable} interface and provides common
 * properties for specific types of materials, such as ISBN, title, author, and
 * year of publication. Specific types of materials should extend this class and
 * implement the abstract method {@code mostrarInformacionEspecifica()}.</p>
 *
 * @since 1.0
 *
 * @see Prestable
 * @see Libro
 * @see Revista
 *
 * @author David Quiroja (19JuanDavid)
 *
 * @version 1.0
 */
public abstract class Material implements Prestable {

    /**
     * The ISBN of the material.
     */
    private String isbn;

    /**
     * The title of the material.
     */
    private String title;

    /**
     * The author of the material.
     */
    private String author;

    /**
     * The year of publication of the material.
     */
    private int yearPublication;

    /**
     * Constructs a new material with the specified ISBN, title, author,
     * and year of publication.
     *
     * @param isbn the ISBN of the material
     * @param title the title of the material
     * @param author the author of the material
     * @param yearPublication the year of publication of the material
     */
    protected Material(String isbn, String title, String author, int yearPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    /**
     * Returns the ISBN of the material.
     *
     * @return the ISBN of the material
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the ISBN of the material.
     *
     * @param isbn the new ISBN of the material
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Returns the title of the material.
     *
     * @return the title of the material
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the material.
     *
     * @param title the new title of the material
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the author of the material.
     *
     * @return the author of the material
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the material.
     *
     * @param author the new author of the material
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the year of publication of the material.
     *
     * @return the year of publication of the material
     */
    public int getYearPublication() {
        return yearPublication;
    }

    /**
     * Sets the year of publication of the material.
     *
     * @param yearPublication the new year of publication of the material
     */
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    /**
     * Shows specific information about the material.
     *
     * <p>This method should be overridden by subclasses to provide specific information about the material.</p>
     */
    public abstract void mostrarInformacionEspecifica();

}