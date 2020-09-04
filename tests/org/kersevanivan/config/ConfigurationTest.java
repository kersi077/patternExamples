package org.kersevanivan.config;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>Title: ConfigurationTest</p>
 * <p>Description: </p>
 * <p>$LastChangedRevision: $</p>
 * <p>$Id: $</p>
 * <p>$LastChangedDate: $</p>
 * <p>$HeadURL: $</p>
 *
 * @author ivan
 * @version 04.09.20 11:50
 */
public class ConfigurationTest {

    @Test
    public void getInstance() {
        Assert.assertNotNull( Configuration.getInstance() );
    }
}
