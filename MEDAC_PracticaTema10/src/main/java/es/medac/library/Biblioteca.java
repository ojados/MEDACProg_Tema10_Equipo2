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
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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
                LOGGER.log(Level.FINE, ANSI_GREEN + "Devolución realizada." + ANSI_GREEN);
                return;
            }
        }

        LOGGER.log(Level.WARNING, "El material no está en préstamo.");
    }

    @Override
    public void mostrarInformacionPrestamos() {

        LOGGER.log(Level.INFO, ANSI_GREEN + "Prestamos: {0}\n" + "Usuario {1}\n" + ANSI_RESET, new Object[]{prestamos, usuarios});
    }
}