package es.medac.users;

/**
 * The {@code Usuario} class is an abstract class that serves as
 * a blueprint for all types of users in the library system.
 * Each user has a first name, last name, and an ID.
 * This class provides the basic functionality that all users should have, such as getting and setting the first name, last name, and ID.
 * It also declares an abstract method {@code mostrarInformacionEspecifica()} that must be implemented by any class that extends {@code Usuario}.
 *
 * @since 1.0
 *
 * @author Daniel Romero (JDan)
 * @version 1.0
 */
public abstract class Usuario {

    /**
     * The first name of the user. This is a {@code String}
     * that represents the user's first name.
     */
    private String firstName;

    /**
     * The last name of the user. This is a {@code String}
     * that represents the user's last name.
     */
    private String lastName;

    /**
     * The ID of the user. This is a {@code String}
     * that uniquely identifies the user.
     */
    private String id;

    /**
     * Constructs a new {@code Usuario} with the specified first name, last name, and ID.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param id the ID of the user
     */
    public Usuario(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Returns the first name of this user.
     *
     * @return the first name of this user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of this user to the specified value.
     *
     * @param firstName the new first name of this user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of this user.
     *
     * @return the last name of this user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of this user to the specified value.
     *
     * @param lastName the new last name of this user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the ID of this user.
     *
     * @return the ID of this user
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of this user to the specified value.
     *
     * @param id the new ID of this user
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This is an abstract method that must be implemented
     * by any class that extends {@code Usuario}. It is
     * intended to display specific information about the user.
     */
    abstract void mostrarInformacionEspecifica();
}
