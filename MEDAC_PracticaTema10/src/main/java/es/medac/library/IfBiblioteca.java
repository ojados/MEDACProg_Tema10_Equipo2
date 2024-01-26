package es.medac.library;

import es.medac.material.Material;
import es.medac.users.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class is a interface that have its methods.
 *
 *
 * @author Katerine Hidalgo (Katehlo0412)
 * @author Daniel Hernandez (dhernandeez13)
 * @author Daniel Romero (JDan)
 */
public interface IfBiblioteca {

    void prestarMaterial(Material material, Usuario user, LocalDate date);

    void devolverMaterial(Material material, LocalDate date);

    void mostrarInformacionPrestamos();
}
