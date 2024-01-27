package es.medac.library;

import es.medac.material.Material;
import es.medac.miscellany.Colors;
import es.medac.users.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;

import static es.medac.miscellany.LogLibrary.LOGGER;

/**
 * The {@code Biblioteca} class represents a library in the system.
 *
 * <p>This class manages the materials and users in the library.
 * It provides methods to add and remove materials, register and unregister
 * users, and check out and return materials.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Biblioteca biblioteca = new Biblioteca();
 *     biblioteca.addMaterial(new Book("Title", "Author", "ISBN"));
 *     biblioteca.registerUser(new Estudiante("John", "Doe", "123", "Computer Science"));
 *     biblioteca.checkOutMaterial("ISBN", "123");
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see IfBiblioteca
 * @see Prestamo
 * @see Usuario
 * @see Material
 *
 * @author Daniel Romero (JDan)
 * @author Katerine Hidalgo (Katehlo0412)
 * @author Daniel Hernandez (dhernandeez13)
 * @author Alonso Jesus (Penguin)
 *
 * @version 1.1
 */
public class Biblioteca implements IfBiblioteca {

    /**
     * List of loans in the library.
     *
     * <p>This list stores all the loans that have been made in the library.
     * Each loan is represented by an instance of the {@code Prestamo} class.</p>
     */
    private final ArrayList<Prestamo> prestamos;

    /**
     * List of users in the library.
     *
     * <p>This list stores all the users that are registered in the library.
     * Each user is represented by an instance of a class that extends the
     * {@code Usuario} class.</p>
     */
    private final ArrayList<Usuario> usuarios;

    /**
     * Constructs a new {@code Biblioteca} instance.
     *
     * <p>This constructor initializes the lists of loans and users.</p>
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     Biblioteca biblioteca = new Biblioteca();
     * </pre></blockquote>
     */
    public Biblioteca() {

        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Lends a material to a user.
     *
     * <p>This method creates a new loan, adds the user to the list of users,
     * and adds the loan to the list of loans. It also sets the loan date of
     * the loan and registers the loan.</p>
     *
     * @param material the material to be lent, an instance of a class that
     *                 extends the {@code Material} class
     * @param user the user to lend the material to, an instance of a class
     *             that extends the {@code Usuario} class
     * @param date the date of the loan, a {@code LocalDate}
     */
    @Override
    public void prestarMaterial(Material material, Usuario user, LocalDate date) {

        LOGGER.info("-------- PRESTAMO --------");

        Prestamo prestamo = new Prestamo(material, user, date);

        this.usuarios.add(prestamo.getUser());
        this.prestamos.add(prestamo);

        prestamo.setLoanDate(date);

        prestamo.getMaterial().mostrarInformacionEspecifica();
        prestamo.getUser().mostrarInformacionEspecifica();
        prestamo.registrarPrestamo();

        LOGGER.log(Level.INFO, Colors.ANSI_BLUE + "Préstamo realizado." + Colors.ANSI_RESET);

        LOGGER.info("----------------------------");
    }

    /**
     * Returns a material.
     *
     * <p>This method finds the loan of the material in the list of loans and
     * removes it. It also sets the return date of the loan and registers the
     * return. If the material is not on loan, it logs a warning message.</p>
     *
     * @param material the material to be returned, an instance of a class
     *                 that extends the {@code Material} class
     * @param date the date of the return, a {@code LocalDate}
     */
    @Override
    public void devolverMaterial(Material material, LocalDate date) {

        LOGGER.info("-------- DEVOLUCION --------");
        for (Prestamo prestamo : prestamos) {

            if (prestamo.getMaterial().equals(material)) {

                this.prestamos.remove(prestamo);
                prestamo.setReturnDate(date);

                prestamo.getMaterial().mostrarInformacionEspecifica();
                prestamo.getUser().mostrarInformacionEspecifica();
                prestamo.registrarDevolucion();

                LOGGER.log(Level.INFO, Colors.ANSI_BLUE + "Devolución realizada." + Colors.ANSI_RESET);
            } else {

                    LOGGER.log(Level.WARNING, "El material no está en préstamo.");
            }
        }

        LOGGER.info("----------------------------");
    }

    /**
     * Displays the information of all loans.
     *
     * <p>This method logs the information of all loans and users in the library.</p>
     */
    @Override
    public void mostrarInformacionPrestamos() {

        LOGGER.log(Level.INFO, Colors.ANSI_GREEN + "-------- PRESTAMOS --------" + Colors.ANSI_RESET);
        LOGGER.log(Level.INFO, Colors.ANSI_GREEN + "{}" + Colors.ANSI_RESET, prestamos);
    }
}