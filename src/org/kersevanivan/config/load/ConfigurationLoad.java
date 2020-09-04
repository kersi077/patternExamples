package org.kersevanivan.config.load;

import org.kersevanivan.config.Configuration;

import java.util.Optional;

/**
 * <p>Title: ConfigurationLoad</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 12:03
 */
public interface ConfigurationLoad {
    /**
     * Loads a configuration.
     * @return the loaded configuration or an empty optional if there isn't one.
     */
    public Optional<Configuration> loadConfiguration() throws ConfigurationNotFoundException;
}
