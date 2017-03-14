/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.EncryptionAlgorithms;

import configs.Config;
import java.util.Random;

/**
 * Zodiac Encryption
 * @author Octavian
 */
public class ZEncryption extends RootEncryption{
    
    private StringBuilder cpass;
    private StringBuilder key;
    private Random randomizer;
    private int randomNum;
    
    public ZEncryption()
    {
        randomizer = new Random();
        key = new StringBuilder();
    }
    
    @Override
    public String encrypt(String word)
    {
        //randomizer = new Random();
         randomNum = randomizer.nextInt(Config.REAL_VALUE);
        cpass = new StringBuilder(word.length());
        //randomizer.nextInt();
        
        for(int i = 0; i < word.length(); i++)
        {
            randomNum = randomizer.nextInt(Config.REAL_VALUE) + 1;
            cpass.append((char)(word.charAt(i) + randomNum));
            key.append(randomNum);
        }

        return cpass.toString();
    }

    
    @Override
    public String getKey()
    {
        return key.toString();
    }
    
    public void purge()
    {
        this.key = null;
        this.cpass = null;
    }
    
}
