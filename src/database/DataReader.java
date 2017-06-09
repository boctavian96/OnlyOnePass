/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Adelina
 */
public class DataReader {
    private String passRd;
    private String siteRd;
    public ArrayList<Account> accounts;
    
    
	public void ReadMyData() throws IOException
	{
         
            try
            {
                String readlineUser;
                String readlinePassword;
                String readlineKey1;
                String readlineKey2;
                
                File passPath = new File("passes.oop");
                File sitePath = new File("sites.oop"); //usernames
                File keyPath = new File("keys.oop");
                
                BufferedReader b1 = new BufferedReader(new FileReader(sitePath));
                BufferedReader b2 = new BufferedReader(new FileReader(passPath));
                BufferedReader b3 = new BufferedReader(new FileReader(keyPath));
                
                while((readlineUser = b1.readLine()) != null)
                {
                    readlinePassword = b2.readLine();
                    readlineKey1 = b3.readLine();
                    readlineKey2 = b3.readLine();
                   
                    accounts.add(new Account(readlineUser, readlinePassword, readlineKey1, readlineKey2));
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    
	}
        
        
        public ArrayList<Account> getAccounts()
        {
            return accounts;
        }
    
    
}
