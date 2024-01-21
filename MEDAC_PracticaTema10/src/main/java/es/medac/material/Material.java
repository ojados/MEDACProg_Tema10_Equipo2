package es.medac.material;

import java.time.LocalDate;

public abstract class Material implements Prestable {
    private final String isbn;
    private final String title;
    private final String author;
    private final LocalDate yearPublication;

    public Material(String isbn, String title, String author, LocalDate yearPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }
}
