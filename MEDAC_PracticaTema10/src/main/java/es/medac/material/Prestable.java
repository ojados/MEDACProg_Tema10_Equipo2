package es.medac.material;

/**
 * The {@code Prestable} interface should be implemented by classes that represent
 * materials that can be lent and returned in the library system.
 *
 * <p>This interface provides two methods, {@code prestar()} and {@code devolver()},
 * which should be implemented to define the behavior when the material is lent
 * and returned, respectively.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     public class Libro extends Material implements Prestable {
 *         // ...
 *         @Override
 *         public void prestar() {
 *             // Define behavior when the book is lent
 *         }
 *
 *         @Override
 *         public void devolver() {
 *             // Define behavior when the book is returned
 *         }
 *     }
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see Material
 * @see Libro
 * @see Revista
 *
 * @author Anouar Mais
 * @author David Quiroga (19JuanDavid)
 *
 * @version 1.0
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
