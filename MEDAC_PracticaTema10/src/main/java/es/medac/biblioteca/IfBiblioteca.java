package es.medac.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import es.medac.material.Material;


public interface IfBiblioteca {
    /**
     * Metodo prestar material que incluye un Array con Usuario y LocalDate
      */
void prestarMaterial(ArrayList<Material> material, Usuario user, LocalDate date);

    /**
     * Metodo devolver Material que incluye un Array con LocalDate
     */
    void devolverMaterial(ArrayList<Material> material, LocalDate date);

    /**
     * Metodo mostrar informacion de prestamo que no incluye nada
     */
    void mostrarInformacionPrestamo();
}
