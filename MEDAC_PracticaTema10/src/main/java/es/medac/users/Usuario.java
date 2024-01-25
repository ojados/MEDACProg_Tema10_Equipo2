package es.medac.users;

/**
 * The {@code Usuario} class is an abstract class that serves as
 * a blueprint for all types of users in the library system.
 *
 * Each user has a first name, last name, and an ID. This class provides the basic functionality that all users should have, such as getting and setting the first name, last name, and ID.
 * It also declares an abstract method {@code mostrarInformacionEspecifica()} that must be implemented by any class that extends {@code Usuario}.
 *
 * @since 1.0
 * @author Daniel Romero (JDan)
 * @version 1.0
 */
public abstract class Usuario {

    /**
     * The first name of the user. This is a {@code String}
     * that represents the user's first name in the system.
     */
    private String firstName;

    /**
     * The last name of the user. This is a {@code String}
     * that represents the user's last name in the system.
     */
    private String lastName;

    /**
     * The ID of the user. This is a {@code String}
     * that uniquely identifies the user in the system.
     *
     * Note: The ID should be unique for each user.
     */
    private String id;

    /**
     * Constructs a new {@code Usuario} with the specified first name, last name, and ID.
     *
     * The constructor initializes the first name, last name, and ID properties of the {@code Usuario} class using the provided values.
     *
     * @param firstName the first name of the user, a {@code String}
     * @param lastName the last name of the user, a {@code String}
     * @param id the ID of the user, a {@code String}
     */
    protected Usuario(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Returns the first name of this user.
     *
     * This method is a getter for the firstName property of the {@code Usuario} class.
     * It returns the first name of the user.
     *
     * @return the first name of this user, a {@code String}
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of this user to the specified value.
     *
     * This method is a setter for the firstName property of the {@code Usuario} class.
     * It updates the first name of the user.
     *
     * @param firstName the new first name of this user, a {@code String}
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of this user.
     *
     * This method is a getter for the lastName property of the {@code Usuario} class.
     * It returns the last name of the user.
     *
     * @return the last name of this user, a {@code String}
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of this user to the specified value.
     *
     * This method is a setter for the lastName property of the {@code Usuario} class.
     * It updates the last name of the user.
     *
     * @param lastName the new last name of this user, a {@code String}
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the ID of this user.
     *
     * This method is a getter for the id property of the {@code Usuario} class.
     * It returns the ID of the user.
     *
     * @return the ID of this user, a {@code String}
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of this user to the specified value.
     *
     * This method is a setter for the id property of the {@code Usuario} class.
     * It updates the ID of the user.
     *
     * @param id the new ID of this user, a {@code String}
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Displays the specific information of this user.
     *
     * This method is an abstract method that must be implemented by any class that extends {@code Usuario}.
     * It is intended to display specific information about the user, which can vary depending on the type of user.
     *
     * <p>Example usage in a subclass:</p>
     * <blockquote><pre>
     *     @Override
     *     public void mostrarInformacionEspecifica() {
     *         // Implementation specific to this subclass
     *     }
     * </pre></blockquote>
     *
     * Note: As this is an abstract method, it does not have a concrete implementation in the {@code Usuario} class.
     */
    public abstract void mostrarInformacionEspecifica();
}
