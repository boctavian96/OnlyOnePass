/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.EncryptionAlgorithms;

import java.util.Random;
import configs.Config;

/**
 *
 * @author Octavian
 */
public class MultiplyEncryption extends RootEncryption{
    
    private StringBuilder cpass;
    private StringBuilder key;
    private Random randomizer;
    private int randomNum;
    
    public MultiplyEncryption()
    {
        randomizer = new Random();
        key = new StringBuilder();
    }
    
    /**
     * 
     * @return 
     */
    public String getKey()
    {
        return key.toString();
    }
    
    /**
     * 
     * @param word
     * @return 
     */
    public String encrypt(String word)
    {
       randomNum = randomizer.nextInt(Config.REAL_VALUE);
       cpass = new StringBuilder(word.length());
       
       for(int i = 0; i < word.length(); i++)
       {
           randomNum = randomizer.nextInt(Config.REAL_VALUE) + 1;
           cpass.append((char)(word.charAt(i) * randomNum));
           key.append(randomNum);
       }
       
       return cpass.toString();
    }
}
