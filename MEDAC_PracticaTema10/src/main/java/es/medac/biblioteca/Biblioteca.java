package es.medac.biblioteca;

import es.medac.material.Material;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Creacion de la clase Biblioteca que implementa IfBiblioteca
 */
public class Biblioteca implements IfBiblioteca {
    /**
     * ArrayList de la clase Material
     */
    ArrayList<Material>;
    /**
     * ArrayList de la clase Prestamo con un usuario
     */
    ArrayList<Prestamo> borrowed;
    private Usuario user ;


    }

    /**
     *
     * @param material
     * @param user
     * @param date
     * Metodos sobreescritos de la interfaz IfBiblioteca
     */
    @Override
    public void prestarMaterial(ArrayList<Material> material, Usuario user, LocalDate date) {

    }

    @Override
    public void devolverMaterial(ArrayList<Material> material, LocalDate date) {

    }

    @Override
    public void mostrarInformacionPrestamo() {

    }
}
