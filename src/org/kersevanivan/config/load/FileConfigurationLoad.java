package org.kersevanivan.config.load;

import org.kersevanivan.config.Configuration;
import org.kersevanivan.config.load.ConfigurationLoad;
import org.kersevanivan.config.load.ConfigurationNotFoundException;

import java.io.*;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Title: FileConfigurationLoad</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 12:06
 */
public class FileConfigurationLoad implements ConfigurationLoad {

    private final File configFile;

    public FileConfigurationLoad(File configFile) {
        Objects.requireNonNull(configFile, "ConfigFile must not be null!");
        if( !configFile.isFile() ) throw new NullPointerException("ConfigFile is not a file.");
        this.configFile = configFile;
    }

    @Override
    public Optional<Configuration> loadConfiguration() throws ConfigurationNotFoundException {
        return Optional.empty(); // TODO: write code, which loads the configuration from a file.
        // The configuration is stored like key=value in the file. Look into the folder testfiles for examples.
    }
}
