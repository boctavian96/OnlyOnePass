/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import logic.Decrypter;
import logic.PasswordRating;

/**
 *
 * @author Octavian
 */
public class Account {
    
    public static float security;
    public static int index = 0;
    private String username;
    private String password;
    private String key1;
    private String key2;
    
    
    private Decrypter d;
    private PasswordRating pr;

    public Account(String username, String password, String key1, String key2) 
    {
        this.username = username;
        this.password = password;
        this.key1 = key1;
        this.key2 = key2;
        index++;
        
       // d = new Decrypter(key2, password);
        //pr = new PasswordRating(d.startDecr());
        //security += pr.getRating();
    }
    
    public static float totalSecurity()
    {
        return security/index;
    }
    
    public float gts()
    {
        return totalSecurity();
    }
    
    //Setters
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setKeys(String key1, String key2)
    {
        this.key1 = key1;
        this.key2 = key2;
    }
    
    //Getters
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getKey1()
    {
        return key1;
    }
    
    public String getKey2()
    {
        return key2;
    }
   
}
