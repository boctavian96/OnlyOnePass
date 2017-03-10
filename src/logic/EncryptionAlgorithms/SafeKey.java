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
public class SafeKey {
    
    private StringBuilder sb;
    private Random k_num_randomizer;
    private Random num_randomizer;
    private Random char_randomizer;
    
    public SafeKey(StringBuilder word)
    {
        this.sb = word;
        k_num_randomizer = new Random();
        num_randomizer = new Random();
        char_randomizer = new Random();
    }
    
    public String getKey()
    {
        return cryptKey();
    }
    
    private String cryptKey()
    {
        int kl = setKeyRule();
        for(int i = 0; i < sb.length(); i++)
        {
            
        }
        
        
        return sb.toString();
    }
    
    private int setKeyRule()
    {
        int kl = k_num_randomizer.nextInt(10000);
        return kl;
    }
    
}
