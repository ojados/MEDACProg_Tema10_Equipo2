package es.medac.miscellany;

import java.util.Arrays;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * The {@code CustomFormatter} class extends the {@code SimpleFormatter} class
 * and overrides the {@code format} method.
 *
 * <p>This class is used to customize the format of log records. If the log
 * record message contains "{}", it replaces "{}" with the string representation
 * of the log record parameters. Otherwise, it returns the log record level and
 * message as is.</p>
 *
 * <p>Example usage:</p>
 * <blockquote><pre>
 *     Logger logger = Logger.getLogger("MyLogger");
 *     CustomFormatter formatter = new CustomFormatter();
 *     ConsoleHandler handler = new ConsoleHandler();
 *     handler.setFormatter(formatter);
 *     logger.addHandler(handler);
 *     logger.log(Level.INFO, "This is a log message with parameters: {}", new Object[]{1, 2, 3});
 * </pre></blockquote>
 *
 * @since 1.0
 *
 * @see java.util.logging.SimpleFormatter
 * @see java.util.logging.LogRecord
 *
 * @author Daniel Romero (JDan)
 *
 * @version 1.0
 */
public class CustomFormatter extends SimpleFormatter {

    /**
     * Formats the given log record and returns a formatted string.
     *
     * <p>If the log record message contains "{}", it replaces "{}" with
     * the string representation of the log record parameters. Otherwise,
     * it returns the log record level and message as is.</p>
     *
     * @param logRecord the log record to be formatted
     * @return a formatted string
     */
    @Override
    public String format(LogRecord logRecord) {

        if (logRecord.getMessage().contains("{}")) {
            return logRecord.getLevel() + ": " +
                    logRecord.getMessage().replace("{}", Arrays.toString(logRecord.getParameters())) + "\n";
        } else {
            return logRecord.getLevel() + ": " + logRecord.getMessage() + "\n";
        }
    }
}