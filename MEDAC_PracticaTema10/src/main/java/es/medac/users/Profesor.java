package es.medac.users;

import java.util.logging.Logger;

/**
 * The {@code Profesor} class represents a student user in the library system.
 *
 * This class extends the {@code Usuario} class, inheriting its properties and methods.
 * Additional properties specific to a student user, such as the degree, are also defined.
 * It provides methods to get and set the degree, and to display specific information about the student.
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Profesor profesor = new Profesor("John", "Doe", "123", "Computer Science");
 *     profesor.mostrarInformacionEspecifica();
 * </pre></blockquote>
 *
 * @since 1.0
 * @see Usuario
 * @author Daniel Romero (JDan)
 * @author Alonso Jesús Sánchez (Penguin)
 * @version 1.0
 */
public class Profesor extends Usuario {


    /**
     * Logger for this class.
     *
     * The {@code Logger} instance is used to log informational, warning, and error messages that occur during the execution of methods in this class.
     * It provides a global logging system that can be used to track the flow of execution and detect anomalies in the program's behavior.
     *
     * <p>Example usage within the class:</p>
     * <blockquote><pre>
     *     LOGGER.info("Informational message");
     *     LOGGER.warning("Warning message");
     *     LOGGER.severe("Error message");
     * </pre></blockquote>
     *
     * @see java.util.logging.Logger
     */
    private static final Logger LOGGER = Logger.getLogger(Profesor.class.getName());

    /**
     * The department of the teacher. This is a {@code String}
     * that represents the department that the teacher is working.
     *
     * @see #getDepartment()
     * @see #setDepartment(String department)
     */
    private String department;

    /**
     * Constructs a new {@code Profesor} with the specified first name, last name, ID, and department.
     *
     * The constructor initializes the inherited properties from the {@code Usuario} class using the provided first name, last name, and ID.
     * It also initializes the department property specific to the {@code Profesor} class.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     Profesor profesor = new Profesor("John", "Doe", "123", "English department");
     * </pre></blockquote>
     *
     * @param firstName the first name of the teacher, a {@code String}
     * @param lastName the last name of the teacher, a {@code String}
     * @param id the ID of the teacher, a {@code String}
     * @param department the degree of the teacher, a {@code String}
     *
     * @see Usuario#Usuario(String firstName, String lastName, String id)
     */
    public Profesor(String firstName, String lastName, String id, String department) {
        super(firstName, lastName, id);
        this.department = department;
    }

    /**
     * Return the department of the teacher.
     *
     * This method is a getter for the department property of the {@code Profesor} class.
     * It returns the department that the teacher is working.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     String department = profesor.getDepartment();
     * </pre></blockquote>
     *
     * @return the department of the teacher, a {@code String}
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the teacher.
     *
     * This method is a setter for the department property of the {@code Profesor} class.
     * It updates the department that the teacher is working.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     profesor.setDepartment("English department");
     * </pre></blockquote>
     *
     * @param department the new department of the teacher, a {@code String}
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Displays specific information about the teacher.
     *
     * This method logs the first name, last name, ID, and department of the teacher using the {@code Logger} instance of this class.
     * It is an overridden method from the {@code Usuario} class, providing specific implementation for the {@code Profesor} class.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     profesor.mostrarInformacionEspecifica();
     * </pre></blockquote>
     *
     * @see java.util.logging.Logger
     * @see Usuario#mostrarInformacionEspecifica()
     */
    @Override
    public void mostrarInformacionEspecifica() {
        LOGGER.info("Nombre: " + getFirstName());
        LOGGER.info("Apellidos: " + getLastName());
        LOGGER.info("ID: " + getId());
        LOGGER.info("Departamento: " + getDepartment());
    }
}
