package es.medac.users;

/**
 * The {@code Usuario} class is an abstract class that serves as
 * a blueprint for all types of users in the library system.
 *
 * <p>Each user has a first name, last name, and an ID. This class provides
 * the basic functionality that all users should have, such as getting
 * and setting the first name, last name, and ID.</p>
 *
 * <p>It also declares an abstract method {@code mostrarInformacionEspecifica()}
 * that must be implemented by any class that extends {@code Usuario}.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Usuario usuario = new Estudiante("John", "Doe", "123456", "Computer Science");
 *     usuario.mostrarInformacionEspecifica();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Estudiante
 * @see Profesor
 *
 * @author Daniel Romero (JDan)
 *
 * @version 1.0
 */
public abstract class Usuario {

    /**
     * The first name of the user.
     */
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The ID of the user.
     */
    private String id;

    /**
     * Constructs a new {@code Usuario} with the specified first name,
     * last name, and ID.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param id the ID of the user
     */
    protected Usuario(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Returns the first name of the user.
     *
     * @return the first name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the new first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the user.
     *
     * @return the last name of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the new last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the ID of the user.
     *
     * @return the ID of the user
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the user.
     *
     * @param id the new ID of the user
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Displays specific information about the user.
     * This method must be implemented by any class that extends {@code Usuario}.
     */
    public abstract void mostrarInformacionEspecifica();
}
