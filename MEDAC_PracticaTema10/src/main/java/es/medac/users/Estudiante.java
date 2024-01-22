package es.medac.users;

import java.util.logging.Logger;

/**
 * The {@code Estudiante} class represents a student user in the library system.
 *
 * This class extends the {@code Usuario} class, inheriting its properties and methods.
 * Additional properties specific to a student user, such as the degree, are also defined.
 * It provides methods to get and set the degree, and to display specific information about the student.
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Estudiante estudiante = new Estudiante("John", "Doe", "123", "Computer Science");
 *     estudiante.mostrarInformacionEspecifica();
 * </pre></blockquote>
 *
 * @since 1.0
 * @see Usuario
 * @author Daniel Romero (JDan)
 * @version 1.0
 */
public class Estudiante extends Usuario {


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
    private static final Logger LOGGER = Logger.getLogger(Estudiante.class.getName());

    /**
     * The degree of the student. This is a {@code String}
     * that represents the degree that the student is studying.
     *
     * @see #getDegree()
     * @see #setDegree(String)
     */
    private String degree;

    /**
     * Constructs a new {@code Estudiante} with the specified first name, last name, ID, and degree.
     *
     * The constructor initializes the inherited properties from the {@code Usuario} class using the provided first name, last name, and ID.
     * It also initializes the degree property specific to the {@code Estudiante} class.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     Estudiante estudiante = new Estudiante("John", "Doe", "123", "Computer Science");
     * </pre></blockquote>
     *
     * @param firstName the first name of the student, a {@code String}
     * @param lastName the last name of the student, a {@code String}
     * @param id the ID of the student, a {@code String}
     * @param degree the degree of the student, a {@code String}
     *
     * @see Usuario#Usuario(String firstName, String lastName, String id)
     */
    public Estudiante(String firstName, String lastName, String id, String degree) {
        super(firstName, lastName, id);
        this.degree = degree;
    }

    /**
     * Return the degree of the student.
     *
     * This method is a getter for the degree property of the {@code Estudiante} class.
     * It returns the degree that the student is studying.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     String degree = estudiante.getDegree();
     * </pre></blockquote>
     *
     * @return the degree of the student, a {@code String}
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the degree of the student.
     *
     * This method is a setter for the degree property of the {@code Estudiante} class.
     * It updates the degree that the student is studying.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     estudiante.setDegree("Computer Science");
     * </pre></blockquote>
     *
     * @param degree the new degree of the student, a {@code String}
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Displays specific information about the student.
     *
     * This method logs the first name, last name, ID, and degree of the student using the {@code Logger} instance of this class.
     * It is an overridden method from the {@code Usuario} class, providing specific implementation for the {@code Estudiante} class.
     *
     * <p>Example usage:</p>
     * <blockquote><pre>
     *     estudiante.mostrarInformacionEspecifica();
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
        LOGGER.info("Grado: " + getDegree());
    }
}
