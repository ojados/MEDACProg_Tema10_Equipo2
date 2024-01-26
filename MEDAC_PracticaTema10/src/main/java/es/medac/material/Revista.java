package es.medac.material;

import java.time.LocalDate;

public class Revista extends Material {

    boolean borrowed = false;

    int numArticulos;

    public Revista(String isbn, String titulo, String autor, LocalDate anioDePublicacion, boolean borrowed, int numArticulos) {
        super(isbn, titulo, autor, anioDePublicacion);
        this.borrowed = borrowed;
        this.numArticulos = numArticulos;
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
    public String toString() {
        return "Revista{" + "prestados=" + borrowed + ", numArticulos=" + numArticulos + ", ISBN=" + getIsbn() +
                ", titulo='" + getTitle() + '\'' +
                ", autor='" + getAuthor() + '\'' +
                ", anioDePublicacion=" + getYearPublication() +
                '}';
    }

    @Override
    public void prestar() {
        borrowed = true;
    }

    @Override
    public void devolver() {
        borrowed = false;

    }

    @Override
    public void mostrarInformacionEspecifica() {

    }
}









