/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.ConfigurationProperties;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class DaoArticles {
    
    public List<String> getAllArticles() {
        List<String> idArticles = null;
        try {
            Path fileArticulos = Paths.get(ConfigurationProperties.
                    getInstance().getProperties().getProperty("idArticles"));

            idArticles = Files.readAllLines(fileArticulos);
        } catch (IOException ex) {
            Logger.getLogger(DaoArticles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idArticles;
    }
    
}
