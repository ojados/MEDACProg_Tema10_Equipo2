package es.medac.material;

/**
 * This is the Prestable interface which is implemented by classes that represent materials that can be lent and returned.
 */
public interface Prestable {

    /**
     * This method represents the action of lending a material.
     * Implementations should define the behavior when the material is lent.
     */
    void prestar();

    /**
     * This method represents the action of returning a material.
     * Implementations should define the behavior when the material is returned.
     */
    void devolver();
}
