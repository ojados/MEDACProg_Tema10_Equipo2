package es.medac.library;

import es.medac.exceptions.PrestamoVencidoException;
import es.medac.material.Material;
import es.medac.users.Usuario;

import java.time.LocalDate;

/**
 * The {@code Prestamo} class represents a loan in the library system.
 *
 * <p>This class manages the loan of a material to a user. It provides methods
 * to register the loan and return of the material.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Prestamo prestamo = new Prestamo(material, user, loanDate);
 *     prestamo.registrarPrestamo();
 *     prestamo.registrarDevolucion();
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Biblioteca
 *
 * @author Daniel Romero (JDan)
 *
 * @version 1.1
 */
public class Prestamo {

    /**
     * The material of the loan.
     */
    private Material material;

    /**
     * The user of the loan.
     */
    private Usuario user;

    /**
     * The date of the loan.
     */
    private LocalDate loanDate;

    /**
     * The return date of the loan.
     */
    private LocalDate returnDate;

    /**
     * Constructs a new loan with the specified material, user, loan date,
     * and return date.
     *
     * @param material the material of the loan
     * @param user the user of the loan
     * @param loanDate the date of the loan
     * @param returnDate the return date of the loan
     */
    public Prestamo(Material material, Usuario user, LocalDate loanDate, LocalDate returnDate) {
        this.material = material;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    /**
     * Constructs a new loan with the specified material, user, and loan date.
     *
     * @param material the material of the loan
     * @param user the user of the loan
     * @param loanDate the date of the loan
     */
    public Prestamo(Material material, Usuario user, LocalDate loanDate) {
        this.material = material;
        this.user = user;
        this.loanDate = loanDate;
    }

    /**
     * Returns the material of the loan.
     *
     * @return the material of the loan
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets the material of the loan.
     *
     * @param material the new material of the loan
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Returns the user of the loan.
     *
     * @return the user of the loan
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * Sets the user of the loan.
     *
     * @param user the new user of the loan
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * Returns the date of the loan.
     *
     * @return the date of the loan
     */
    public LocalDate getLoanDate() {
        return loanDate;
    }

    /**
     * Sets the date of the loan.
     *
     * @param loanDate the new date of the loan
     */
    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * Returns the return date of the loan.
     *
     * @return the return date of the loan
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the return date of the loan.
     *
     * @param returnDate the new return date of the loan
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Registers the loan of the material.
     *
     * <p>This method sets the loan date of the material and when the
     * return date is null to one month later.</p>
     */
    public void registrarPrestamo() {

        material.prestar();
        loanDate = getLoanDate();

        if (returnDate == null) {
            returnDate = LocalDate.now().plusMonths(1);
        }
    }

    /**
     * Registers the return of the material.
     *
     * <p>This method sets the return date of the material.</p>
     */
    public void registrarDevolucion() throws PrestamoVencidoException {

        material.devolver();
        returnDate = getReturnDate();
    }

    /**
     * Returns a string representation of the loan.
     *
     * @return a string representation of the loan
     */
    @Override
    public String toString() {
        return "Préstamo: \n" +
                "\tMaterial: " + material + "\n" +
                "\tUsuario: " + user + "\n" +
                "\tFecha de préstamo: " + loanDate + "\n" +
                "\tFecha de devolución: " + returnDate + "\n";
    }
}
