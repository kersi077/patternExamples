package org.kersevanivan.config.load;

import org.kersevanivan.config.Configuration;
import org.kersevanivan.config.load.ConfigurationLoad;
import org.kersevanivan.config.load.ConfigurationNotFoundException;

import java.io.*;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

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
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(this.configFile));
            properties.forEach( (key, value)-> { Configuration.getInstance().addConfig((String)key, (String)value); }  );
            return Optional.of(Configuration.getInstance());
        } catch (IOException e) {
           throw new ConfigurationNotFoundException(e);
        }
    }
}
