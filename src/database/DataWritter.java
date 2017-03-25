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
	public DataWritter(String site, String pass) {
		this.passWr = pass;
		this.siteWr = site;
	}
        public DataWritter( String site) {
	System.out.println("Please input a site AND a password as well");
	}
       
	void WriteMyData() throws IOException
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
    
    
    
    
    
}
