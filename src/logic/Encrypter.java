/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import logic.EncryptionAlgorithms.ZEncryption;

/**
 *
 * @author Octavian
 */
public class Encrypter {
    
    private String username;
    private String password;
    private ZEncryption firstEncryption = new ZEncryption();
    
    public Encrypter()
    {
        
    }
    
    public Encrypter(String username, String password)
    {
        encryptUsername(username);
        encryptPassword(password);
    }
    
    private void encryptUsername(String username)
    {
        this.username = firstEncryption.encrypt(username);
    }
    
    private void encryptPassword(String passwort)
    {
        this.password = firstEncryption.encrypt(password);
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
