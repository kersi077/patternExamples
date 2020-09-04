package org.kersevanivan.config.load;

import java.io.IOException;

/**
 * <p>Title: ConfigurationNotFoundException</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 12:14
 */
public class ConfigurationNotFoundException extends Exception {
    public ConfigurationNotFoundException(Exception exception) {
        super(exception);
    }
}
