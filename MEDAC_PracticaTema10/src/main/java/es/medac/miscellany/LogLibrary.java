package es.medac.miscellany;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

/**
 * The {@code LogLibrary} class provides a global logging system for the
 * application.
 *
 * <p>This class is a utility class and cannot be instantiated. It provides
 * a {@code Logger} instance that is used to log informational, warning,
 * and error messages that occur during the execution of methods in the
 * application. The logger is configured to use a {@code ConsoleHandler}
 * with a {@code CustomFormatter}.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     LogLibrary.LOGGER.info("Informational message");
 *     LogLibrary.LOGGER.warning("Warning message");
 *     LogLibrary.LOGGER.severe("Error message");
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see java.util.logging.Logger
 * @see java.util.logging.ConsoleHandler
 * @see CustomFormatter
 *
 * @author soyJDan
 *
 * @version 1.0
 */
public final class LogLibrary {

    /**
     * Logger for this class.
     *
     * <p>The {@code Logger} instance is used to log informational, warning, and
     * error messages that occur during the execution of methods in this class.
     * It provides a global logging system that can be used to track the flow
     * of execution and detect anomalies in the program's behavior.</p>
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
    public static final Logger LOGGER = Logger.getLogger(LogLibrary.class.getName());

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private LogLibrary() {
        throw new IllegalStateException("Utility class");
    }

    static {
        LOGGER.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new CustomFormatter());
        LOGGER.addHandler(handler);
    }
}
