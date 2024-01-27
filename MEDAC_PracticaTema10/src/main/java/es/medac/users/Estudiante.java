package es.medac.users;

import es.medac.miscellany.Colors;

import java.util.logging.Level;

import static es.medac.miscellany.LogLibrary.LOGGER;

/**
 * The {@code Estudiante} class represents a student user in the system.
 *
 * <p>This class extends the {@code Usuario} class and adds a specific property
 * for the student's degree. It provides methods to get and set the degree, and
 * to display specific information about the student.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Estudiante estudiante = new Estudiante("John", "Doe", "123456", "Computer Science");
 *     estudiante.mostrarInformacionEspecifica();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Usuario
 * @see Profesor
 *
 * @author Daniel Romero (JDan)
 *
 * @version 1.0
 */
public class Estudiante extends Usuario {

    /**
     * The degree of the student.
     */
    private String degree;

    /**
     * Constructs a new {@code Estudiante} with the specified first name, last name, id, and degree.
     *
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param id the id of the student
     * @param degree the degree of the student
     */
    public Estudiante(String firstName, String lastName, String id, String degree) {
        super(firstName, lastName, id);
        this.degree = degree;
    }

    /**
     * Returns the degree of the student.
     *
     * @return the degree of the student
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the degree of the student.
     *
     * @param degree the new degree of the student
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Displays specific information about the student.
     */
    @Override
    public void mostrarInformacionEspecifica() {
        LOGGER.log(Level.INFO, Colors.ANSI_YELLOW);
        LOGGER.info("Información específica del estudiante:");
        LOGGER.info("Nombre: " + getFirstName());
        LOGGER.info("Apellidos: " + getLastName());
        LOGGER.info("ID: " + getId());
        LOGGER.info("Grado: " + getDegree());
        LOGGER.log(Level.INFO, Colors.ANSI_RESET);
    }

    /**
     * Returns a string representation of the student.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Estudiante [" + "\n" +
                "\t\tNombre: " + getFirstName() + "\n" +
                "\t\tApellidos: " + getLastName() + "\n" +
                "\t\tID:" + getId() + "\n" +
                "\t\tGrado:" + degree + "\n" +
                "\t]\n";
    }
}
