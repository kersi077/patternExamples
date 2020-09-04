package org.kersevanivan.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>Title: Configuration.</p>
 * <p>Description: A example for singletons.</p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 11:39
 */
public class Configuration {

    private final Map<String, String> configurationValues = new HashMap<>();

    private static Configuration instance = null; // Lazy loaded instance.

    private Configuration() {}

    public static Configuration getInstance() {
        //TODO: instance is NULL! Complete the code!
        return instance;
    }

    public boolean containsKey(String key) {
        return configurationValues.containsKey(key);
    }

    public String getValue(String key) {
        Objects.requireNonNull(key, "Key must not be null!"); // Key must never be null!

        if( containsKey(key) )
            return configurationValues.get(key);
        else
            throw new IllegalArgumentException("There is no value for key " + key +". Call containsKey(key) first!");
    }

    public void addConfig(String key, String value) {
       //TODO: Complete the code
    }
}
