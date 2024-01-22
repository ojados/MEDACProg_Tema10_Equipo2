package es.medac.material;

import java.time.LocalDate;

/**
 * This is the Material class which is an abstract class that implements
 * the Prestable interface. It represents a generic material with common
 * properties such as ISBN, title, author, and year of publication.
 * Specific types of materials should extend this class and implement the
 * abstract method mostrarInformacionEspecifica().
 */
public abstract class Material implements Prestable {
    private String isbn;
    private String title;
    private String author;
    private LocalDate yearPublication;


    /**
     * Constructor for the Material class.
     * @param isbn ISBN of the material
     * @param title Title of the material
     * @param author Author of the material
     * @param yearPublication Year of publication of the material
     */
    protected Material(String isbn, String title, String author, LocalDate yearPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    /**
     * Getter for the ISBN of the material.
     * @return ISBN of the material
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Setter for the ISBN of the material.
     * @param isbn ISBN of the material
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter for the title of the material.
     * @return Title of the material
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the title of the material.
     * @param title Title of the material
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for the author of the material.
     * @return Author of the material
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for the author of the material.
     * @param author Author of the material
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter for the year of publication of the material.
     * @return Year of publication of the material
     */
    public LocalDate getYearPublication() {
        return yearPublication;
    }

    /**
     * Setter for the year of publication of the material.
     * @param yearPublication Year of publication of the material
     */
    public void setYearPublication(LocalDate yearPublication) {
        this.yearPublication = yearPublication;
    }

    /**
     * Abstract method to show specific information of the material.
     * This method should be implemented by subclasses of Material.
     */
    public abstract void mostrarInformacionEspecifica();

}