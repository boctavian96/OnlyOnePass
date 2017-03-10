/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.EncryptionAlgorithms;

/**
 * Zodiac Encryption
 * @author Octavian
 */
public class ZEncryption extends RootEncryption{
    
    private StringBuilder key;
    
    @Override
    public String encrypt(String word)
    {
        return "crypt";
    }
    
    @Override
    public String getKey()
    {
        return key.toString();
    }
    
}
