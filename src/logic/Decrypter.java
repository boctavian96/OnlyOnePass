/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import logic.BreakKey;

/**
 *
 * @author Octavian
 */
public class Decrypter {
    
    //-------------Variabile------------------
    
    private StringBuilder key;
    private StringBuilder args;
    private BreakKey bk;
    
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
        StringBuilder dArgs = new StringBuilder(this.args.length());
        int inIntKey = Integer.parseInt(key.toString());
        bk = new BreakKey(inIntKey);
        int[] breakedKey = new int[10];
        breakedKey = bk.breakKey();
        for(int i = 0; i < key.length(); i++)
        {
            dArgs.append((char)(args.charAt(i) - bk.result[i]));
            //dArgs.append("_");
        }
        //System.out.println("\n" + bk.breakKey() + "\n");
        System.out.println();
        bk.typeResult();
        System.out.println();
        
        return dArgs.toString();
    }
    
    
    
}
