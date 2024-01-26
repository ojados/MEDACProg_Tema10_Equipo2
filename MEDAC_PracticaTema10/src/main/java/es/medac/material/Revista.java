package es.medac.material;

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

    @Override
    public void mostrarInformacionEspecifica() {
        System.out.println("Número de artículos: " + getNumArticulos());
    }

    @Override
    public String toString() {
        return "Revista{" +
                "isbn='" + getIsbn() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", yearPublication=" + getYearPublication() +
                ", numArticulos=" + numArticulos +
                ", borrowed=" + borrowed +
                '}';
    }
}









