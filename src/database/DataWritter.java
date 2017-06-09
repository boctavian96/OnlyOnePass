/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Adeleena
 */
public class DataWritter {
  	private String passWr;
	private String siteWr;
        private String key1;
        private String key2;
        
	public DataWritter(String site, String pass, String key1, String key2) {
		this.passWr = pass;
		this.siteWr = site;
                this.key1 = key1;
                this.key2 = key2;
	}
        public DataWritter( String site) {
	System.out.println("Please input a site AND a password as well");
	}
       
   
	public void WriteMyData() throws IOException
	{
       /*Write data in the sites related file */
		
		 FileOutputStream outSite = new FileOutputStream("sites.oop",true) ; 
		 ObjectOutputStream oosSite = new ObjectOutputStream(outSite) ;
		 oosSite.writeObject(this.siteWr);
		 oosSite.writeObject("\n");
		 oosSite.flush();
		 oosSite.close();
		
		 /*Write data in the passwords related file */
		 
		 FileOutputStream outPass = new FileOutputStream("passes.oop",true) ; 
		 ObjectOutputStream oosPass = new ObjectOutputStream(outPass ) ;
		 oosPass.writeObject(this.passWr);
		 oosPass.writeObject("\n");
		 oosPass.flush();
		 oosPass.close(); 
		 
	}
        
        public void WriteMyData(String user, String password, String key1, String key2) throws IOException
        {
       /*Write data in the sites related file */
            
                 FileOutputStream outKey = new FileOutputStream("keys.oop",true) ; 
		 ObjectOutputStream oosKey = new ObjectOutputStream(outKey) ;
		 oosKey.writeObject(key1);
                 oosKey.writeObject(key2);
		 oosKey.writeObject("\n");
		 oosKey.flush();
		 oosKey.close();
		
		 FileOutputStream outSite = new FileOutputStream("sites.oop",true) ; 
		 ObjectOutputStream oosSite = new ObjectOutputStream(outSite) ;
		 oosSite.writeObject(user);
		 oosSite.writeObject("\n");
		 oosSite.flush();
		 oosSite.close();
		
		 /*Write data in the passwords related file */
		 
		 FileOutputStream outPass = new FileOutputStream("passes.oop",true) ; 
		 ObjectOutputStream oosPass = new ObjectOutputStream(outPass ) ;
		 oosPass.writeObject(password);
		 oosPass.writeObject("\n");
		 oosPass.flush();
		 oosPass.close(); 
		 
	}
    
    
    
    
    
}
