/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Octavian
 */
public class Decrypter {
    
    //-------------Variabile------------------
    
    private StringBuilder key;
    private StringBuilder args;
    
    //-------------Constructori---------------
    public Decrypter()
    {
        //Pentru testing
    }
    
    public Decrypter(String key, String args)
    {
        this.key = new StringBuilder(key);
        this.args = new StringBuilder(args);
    }
    
    //------------Functii publice-------------
    
    public String startDecr()
    {
        StringBuilder dArgs = new StringBuilder(args.length());
        for(int i = 0; i < key.length(); i++)
        {
            dArgs.append(dArgs.charAt(i) - key.charAt(i));
        }
        
        return dArgs.toString();
    }
    
}
