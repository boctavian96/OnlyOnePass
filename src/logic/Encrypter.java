/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import logic.EncryptionAlgorithms.ZEncryption;
import java.util.Random;

/**
 *
 * @author Octavian
 */
public class Encrypter {
    
    private String username;
    private String password;
    private Random randomint;
    private ZEncryption firstEncryption = new ZEncryption();
    //private SecondEncryption sEncryption = new SecondEncryption();
    //private ThirdEncryption tEncryption = new ThirdEncryption();
    
    public Encrypter()
    {
        
    }
    
    public Encrypter(String username, String password)
    {
        int c = randomint.nextInt(3) + 1;
        encryptUsername(username, c);
        encryptPassword(password, c);
        
    }
    
    private void encryptUsername(String username, int c)
    {
        switch(c)
        {
            case 1:
                this.username = firstEncryption.encrypt(username);
                break;
            case 2:
                
                break;
            case 3: 
                
                break;
        }
    }
    
    private void encryptPassword(String passwort, int c)
    {
        switch(c)
        {
            case 1:
                this.password = firstEncryption.encrypt(password);
                break;
            case 2:
                
                break;
                
            case 3: 
                
                break;
        }
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPasswort()
    {
        return password;
    }
}
