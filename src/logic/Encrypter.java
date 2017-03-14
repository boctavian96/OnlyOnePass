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
    
    private String kPass;
    private String kUser;
    
    private Random randomint;
    private ZEncryption firstEncryption;
    //private SecondEncryption sEncryption = new SecondEncryption();
    //private ThirdEncryption tEncryption = new ThirdEncryption();
    
    public Encrypter()
    {
        firstEncryption = new ZEncryption();
    }
    
    public Encrypter(String username, String password)
    {
        firstEncryption = new ZEncryption();
        int c = 1;
        
        this.password = password;
        this.username = username;
        
        encryptUsername(username, c);
        encryptPassword(password, c);
        
    }
    
    private void encryptUsername(String username, int c)
    {
        switch(c)
        {
            case 1:
                this.username = firstEncryption.encrypt(username);
                this.kUser = firstEncryption.getKey();
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
                this.kPass = firstEncryption.getKey();
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
    
    public String getKUser()
    {
        return kUser;
    }
    
    public String getKPass()
    {
        return kPass;
    }
}
