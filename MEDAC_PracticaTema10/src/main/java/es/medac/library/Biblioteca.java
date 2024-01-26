package es.medac.library;

import es.medac.material.Material;
import es.medac.users.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Creacion de la clase Biblioteca que implementa IfBiblioteca
 */
public class Biblioteca implements IfBiblioteca {

    private static final Logger LOGGER = Logger.getLogger(Biblioteca.class.getName());

    /**
     * ArrayList de la clase Material
     */
    private ArrayList<Material> material;
    /**
     * ArrayList de la clase Prestamo con un usuario
     */
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.material = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void prestarMaterial(Material material, Usuario user, LocalDate date) {

        Prestamo prestamo = new Prestamo(material, user, date);
        this.material.add(prestamo.getMaterial());
        usuarios.add(prestamo.getUser());
        prestamos.add(prestamo);
        prestamo.setLoanDate(date);
        prestamo.registrarPrestamo();
    }

    @Override
    public void devolverMaterial(Material material, LocalDate date) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getMaterial().equals(material)) {
                prestamos.remove(prestamo);
                prestamo.setReturnDate(date);
                prestamo.registrarDevolucion();
                LOGGER.log(Level.FINE, "Devolución realizada.");
                return;
            }
        }

        LOGGER.log(Level.WARNING, "El material no está en préstamo.");
    }

    @Override
    public void mostrarInformacionPrestamos() {

        LOGGER.log(Level.INFO, "Prestamos: {0}\n" + "Usuario {1}\n", new Object[]{prestamos, usuarios});
    }
}