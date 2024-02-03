package es.medac.exceptions;


/**
 * The {@code PrestamoVencidoException} class represents an exception that is thrown when a loan is overdue.
 *
 * @since 1.0
 *
 * @see Exception
 *
 * @version 1.0
 * @author Anouar Mais (Anouarmais)
 * @author Daniel Romero (JDan)
 */
public class PrestamoVencidoException extends Exception {

    /**
     * Constructs a new {@code PrestamoVencidoException} with the specified detail message.
     *
     * @param message the detail message
     */
    public PrestamoVencidoException(String message) {
        super(message);

    }
}
