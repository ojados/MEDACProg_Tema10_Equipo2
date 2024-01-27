package es.medac.users;

import es.medac.miscellany.Colors;

import java.util.logging.Level;

import static es.medac.miscellany.LogLibrary.LOGGER;

/**
 * The {@code Profesor} class represents a teacher user in the library system.
 *
 * <p>This class extends the {@code Usuario} class and adds a specific property
 * for the teacher's department. It provides methods to get and set the
 * department, and to display specific information about the teacher.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Profesor profesor = new Profesor("John", "Doe", "123456", "English department");
 *     profesor.mostrarInformacionEspecifica();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Usuario
 * @see Estudiante
 *
 * @author Daniel Romero (JDan)
 * @author Alonso Jesús (Penguin)
 *
 * @version 1.0
 */
public class Profesor extends Usuario {

    /**
     * The department of the teacher.
     */
    private String department;

    /**
     * Constructs a new {@code Profesor} with the specified first name,
     * last name, id, and department.
     *
     * @param firstName the first name of the teacher
     * @param lastName the last name of the teacher
     * @param id the id of the teacher
     * @param department the department of the teacher
     */
    public Profesor(String firstName, String lastName, String id, String department) {
        super(firstName, lastName, id);
        this.department = department;
    }

    /**
     * Returns the department of the teacher.
     *
     * @return the department of the teacher
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the teacher.
     *
     * @param department the new department of the teacher
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Displays specific information about the teacher.
     */
    @Override
    public void mostrarInformacionEspecifica() {
        LOGGER.log(Level.INFO, Colors.ANSI_YELLOW);
        LOGGER.info("Información específica del profesor:");
        LOGGER.info("Nombre: " + getFirstName());
        LOGGER.info("Apellidos: " + getLastName());
        LOGGER.info("ID: " + getId());
        LOGGER.info("Departamento: " + getDepartment());
        LOGGER.log(Level.INFO, Colors.ANSI_RESET);
    }

    /**
     * Returns a string representation of the teacher.
     *
     * @return a string representation of the teacher
     */
    @Override
    public String toString() {
        return "Profesor [" + "\n" +
                "\t\tNombre: " + getFirstName() + "\n" +
                "\t\tApellidos: " + getLastName() + "\n" +
                "\t\tID:" + getId() + "\n" +
                "\t\tDepartamento:" + department + "\n" +
                "\t]\n";
    }
}
