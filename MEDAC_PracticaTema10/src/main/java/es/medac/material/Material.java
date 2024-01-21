package es.medac.material;

import java.time.LocalDate;

public abstract class Material implements Prestable {
    private String isbn;
    private String title;
    private String author;
    private LocalDate yearPublication;

    public Material(String isbn, String title, String author, LocalDate yearPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(LocalDate yearPublication) {
        this.yearPublication = yearPublication;
    }

    public abstract void mostrarInformacionEspecifica();

}