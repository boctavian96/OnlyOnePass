/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import configs.*;
import database.*;
import java.io.IOException;
import java.util.ArrayList;
import logic.*;
import statistics.*;

/**
 *
 * @author Octavian
 */
public class Manager {
  
    private DataWritter dw;
    private DataReader dr;
    
    private Decrypter d;
    private Encrypter e;
    
    private GenerareParola gp;
    private PasswordRating pr;
    private SecurityRating sr;
    
    private LogGenerator lg;
    
    
    public Manager()
    {
        dw = new DataWritter("/db");
        //dr = new DataReader();
        
        e = new Encrypter();
        
        lg = new LogGenerator();
    }
    
    public String generatePassword(int lungime_parola)
    {
        gp = new GenerareParola(lungime_parola);
        return gp.getPass().toString();
    }
    
    public void insertAccount(String username, String password)
    {
        e.crypt(username, password);
        
        try
        {
            dw.WriteMyData(e.getUsername(), e.getPasswort(), e.getKUser(), e.getKPass());
        }
        catch(IOException e)
        {
            lg = new LogGenerator();
            lg.logError(e.getMessage());
            e.printStackTrace();
        }
    }
    
    public String getMyPassword(int index)
    {
        ArrayList<Account> a;
        String username = new String();
        String password = new String();
        dr = new DataReader();
        try
        {
            dr.ReadMyData();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        a = dr.getAccounts();
        
        d = new Decrypter(a.get(index).getKey1(), a.get(index).getUsername());
        
        username = d.startDecr();
        
        d = new Decrypter(a.get(index).getKey2(), a.get(index).getPassword());
        
        password = d.startDecr();
        
        return password;
    }
    
}
