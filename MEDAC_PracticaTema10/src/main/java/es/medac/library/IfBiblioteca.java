package es.medac.library;

import es.medac.exceptions.PrestamoVencidoException;
import es.medac.material.Material;
import es.medac.users.Usuario;

import java.time.LocalDate;

/**
 * This interface represents the operations that a library can perform.
 *
 * @since 1.0
 *
 * @see Biblioteca
 *
 * @author Daniel Romero (JDan)
 * @author Katerine Hidalgo (Katehlo0412)
 * @author Daniel Hernandez (dhernandeez13)
 *
 * @version 1.1
 */
public interface IfBiblioteca {

    /**
     * This method is used to lend a material to a user.
     *
     * @param material The material to be lent.
     * @param user The user who is borrowing the material.
     * @param date The date when the material is being borrowed.
     */
    void prestarMaterial(Material material, Usuario user, LocalDate date);

    /**
     * This method is used to return a material to the library.
     *
     * @param material The material to be returned.
     * @param date The date when the material is being returned.
     */
    void devolverMaterial(Material material, LocalDate date) throws PrestamoVencidoException;

    /**
     * This method is used to display information about the loans.
     */
    void mostrarInformacionPrestamos();
}
