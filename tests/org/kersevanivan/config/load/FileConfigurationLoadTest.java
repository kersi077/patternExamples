package org.kersevanivan.config.load;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kersevanivan.config.Configuration;

import java.io.File;
import java.util.Optional;

/**
 * <p>Title: FileConfigurationLoadTest</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 12:27
 */
public class FileConfigurationLoadTest {

    @Test
    public void loadConfiguration() throws ConfigurationNotFoundException {
        FileConfigurationLoad fileConfigurationLoad = new FileConfigurationLoad(new File("testfiles/config_a.properties"));
        Optional<Configuration> mayBeConfiguration = fileConfigurationLoad.loadConfiguration();
        Assert.assertTrue(mayBeConfiguration.isPresent());
        Configuration configuration = mayBeConfiguration.get();

        Assert.assertTrue(configuration.containsKey("theme"));
        Assert.assertTrue(configuration.containsKey("version"));
        Assert.assertEquals("darktheme",configuration.getValue("theme"));
        Assert.assertEquals("0.9", configuration.getValue("version"));
        Assert.assertEquals(Configuration.getInstance(), configuration);
    }

    @Test
    public void loadConfigurationAThanB() throws ConfigurationNotFoundException {
        FileConfigurationLoad fileConfigurationLoad = new FileConfigurationLoad(new File("testfiles/config_a.properties"));
        Optional<Configuration> mayBeConfiguration = fileConfigurationLoad.loadConfiguration();
        Assert.assertTrue(mayBeConfiguration.isPresent());
        Configuration configuration = mayBeConfiguration.get();

        Assert.assertTrue(configuration.containsKey("theme"));
        Assert.assertTrue(configuration.containsKey("version"));
        Assert.assertEquals("darktheme",configuration.getValue("theme"));
        Assert.assertEquals("0.9", configuration.getValue("version"));
        Assert.assertEquals(Configuration.getInstance(), configuration);

        fileConfigurationLoad = new FileConfigurationLoad(new File("testfiles/config_b.properties"));
        mayBeConfiguration = fileConfigurationLoad.loadConfiguration();
        Assert.assertTrue(mayBeConfiguration.isPresent());
        configuration = mayBeConfiguration.get();

        Assert.assertTrue(configuration.containsKey("theme"));
        Assert.assertTrue(configuration.containsKey("version"));
        Assert.assertEquals("standardtheme",configuration.getValue("theme"));
        Assert.assertEquals("0.8", configuration.getValue("version"));
        Assert.assertEquals(Configuration.getInstance(), configuration);

    }
}
