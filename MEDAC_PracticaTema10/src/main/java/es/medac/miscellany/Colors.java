package es.medac.miscellany;

/**
 * The {@code Colors} class provides constants for ANSI color codes.
 *
 * <p>This class is a utility class and cannot be instantiated. It provides
 * constants for various ANSI color codes, which can be used to change the
 * color of console output.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     System.out.println(Colors.ANSI_GREEN + "This text will be green" + Colors.ANSI_RESET);
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @author Daniel Romero (JDan)
 *
 * @version 1.0
 */
public final class Colors {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private Colors() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * ANSI color code for reset.
     */
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * ANSI color code for black.
     */
    public static final String ANSI_BLACK = "\u001B[30m";

    /**
     * ANSI color code for red.
     */
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * ANSI color code for green.
     */
    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * ANSI color code for yellow.
     */
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * ANSI color code for blue.
     */
    public static final String ANSI_BLUE = "\u001B[34m";

    /**
     * ANSI color code for purple.
     */
    public static final String ANSI_PURPLE = "\u001B[35m";

    /**
     * ANSI color code for cyan.
     */
    public static final String ANSI_CYAN = "\u001B[36m";

    /**
     * ANSI color code for white.
     */
    public static final String ANSI_WHITE = "\u001B[37m";
}