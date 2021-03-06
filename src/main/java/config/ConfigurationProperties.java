/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConfigurationProperties {
    
    private static ConfigurationProperties config;
    
    private Properties properties;
    
    public Properties getProperties(){
        return properties;
    }
    
    private ConfigurationProperties(){      
    }
    
    public static ConfigurationProperties getInstance() {
        if (config == null) {
            try {
                config = new ConfigurationProperties();
                config.properties = new Properties();
                config.properties.load(new FileInputStream("config/path.properties"));
            } catch (IOException ex) {
                Logger.getLogger(ConfigurationProperties.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return config;
    }
    
}
