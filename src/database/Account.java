/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


/**
 *
 * @author Octavian
 */
public class Account {
    
    public static int index = 0;
    private String username;
    private String password;
    private String key1;
    private String key2;

    public Account(String username, String password, String key1, String key2) 
    {
        this.username = username;
        this.password = password;
        this.key1 = key1;
        this.key2 = key2;
        index++;
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
