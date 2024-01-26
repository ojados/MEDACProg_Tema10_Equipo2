package es.medac.library;

import es.medac.material.Material;
import es.medac.users.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Prestamo {

    private static final Logger LOGGER = Logger.getLogger(Prestamo.class.getName());

    private Material material;
    private Usuario user;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Prestamo(Material material, Usuario user, LocalDate loanDate, LocalDate returnDate) {
        this.material = material;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Prestamo(Material material, Usuario user, LocalDate loanDate) {
        this.material = material;
        this.user = user;
        this.loanDate = loanDate;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void registrarPrestamo() {

        material.prestar();
        loanDate = getLoanDate();
    }

    public void registrarDevolucion() {

        material.devolver();
        returnDate = getReturnDate();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "material=" + material +
                ", user=" + user +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
