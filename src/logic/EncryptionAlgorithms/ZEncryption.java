/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.EncryptionAlgorithms;

import java.util.Random;

/**
 * Zodiac Encryption
 * @author Octavian
 */
public class ZEncryption extends RootEncryption{
    
    private StringBuilder cpass;
    private StringBuilder key;
    private Random randomizer;
    
    public ZEncryption()
    {
        randomizer = new Random();
        key = new StringBuilder();
    }
    
    @Override
    public String encrypt(String word)
    {
        int randomNum = randomizer.nextInt(20) - 10;
        cpass = new StringBuilder(word.length());
        //randomizer.nextInt();
        
        for(int i = 0; i < word.length(); i++)
        {
            if(i%2 == 0)
            {
                randomNum = randomizer.nextInt(20) - 10;
                key.append(randomNum);
                
            }
            
            cpass.append((char)(word.charAt(i) + randomNum));
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
