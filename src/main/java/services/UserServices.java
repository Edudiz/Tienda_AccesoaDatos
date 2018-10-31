/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import config.ConfigurationYaml;

/**
 *
 * @author Usuario
 */
public class UserServices {
    
    public boolean checkUser(String user, String pass) {
        boolean userOK = false;
        if (ConfigurationYaml.getInstance().getUser().equals(user)
                && ConfigurationYaml.getInstance().getPass().equals(pass)) {
            userOK = true;
        }
        return userOK;
    }
}
