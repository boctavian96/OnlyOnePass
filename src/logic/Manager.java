/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

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
  
    private ArrayList<Account> a;
    
    private DataWritter dw;
    private DataReader dr;
    
    private Decrypter d;
    private Encrypter enc;
    
    private GenerareParola gp;
    private PasswordRating pr;
    private SecurityRating sr;
    
    private LogGenerator lg;
    
    
    public Manager()
    {
        
        dw = new DataWritter("/db");
        //dr = new DataReader();
    }
    
    public String generatePassword(int lungime_parola)
    {
        gp = new GenerareParola(lungime_parola);
        return gp.getPass().toString();
    }
    
    public void insertAccount(String username, String password)
    {
        enc = new Encrypter();
        enc.crypt(username, password);
        
        System.out.println("In MANAGER : " + enc.getKUser() + " " + enc.getKPass());
        
        try
        {
            dw.WriteMyData(enc.getUsername(), enc.getPasswort(), enc.getKUser(), enc.getKPass());
        }
        catch(IOException e)
        {
            lg = new LogGenerator();
            lg.logError("getMyPassword()"+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public String getMyUsername(int index)
    {
        String myusername;
        dr = new DataReader();
        try
        {
            dr.ReadMyData();
        }
        catch(IOException e)
        {
            lg = new LogGenerator();
            e.printStackTrace();
            lg.logError("getMyUsername()" + e.getMessage());
        }
        
        a = dr.getAccounts();
        //System.out.println("Marimea lui : " + a.size());
        d = new Decrypter(a.get(index).getKey1(), a.get(index).getUsername());
        
        myusername = d.startDecr();
        
        return myusername;
    }
    
    public String getMyPassword(int index)
    {
        //ArrayList<Account> a;        
        String mypassword;
        dr = new DataReader();
        try
        {
            dr.ReadMyData();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            lg.logError(e.getMessage());
        }
        
        a = dr.getAccounts();
        
        d = new Decrypter(a.get(index).getKey2(), a.get(index).getPassword());
        
        //username = d.startDecr();
        
        //d = new Decrypter(a.get(index).getKey2(), a.get(index).getPassword());
        
        mypassword = d.startDecr();
        
        return mypassword;
    }
    
    public float getTotalSecurity()
    {
        return a.get(0).totalSecurity();
    }
    
}
