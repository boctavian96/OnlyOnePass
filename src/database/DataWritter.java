/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author Adeleena
 */
public class DataWritter {
  	private String passWr;
	private String siteWr;
        private String key1;
        private String key2;
        
        private BufferedWriter bw;
        private FileWriter fw;
        
	public DataWritter(String site, String pass, String key1, String key2) {
		this.passWr = pass;
		this.siteWr = site;
                this.key1 = key1;
                this.key2 = key2;
	}
        public DataWritter( String site) {
	System.out.println("test");
	}
       
   
	public void WriteMyData() throws IOException
	{
       /*Write data in the sites related file */
		
		 FileOutputStream outSite = new FileOutputStream("sites.txt",true) ; 
		 ObjectOutputStream oosSite = new ObjectOutputStream(outSite) ;
		 oosSite.writeObject(this.siteWr);
		 oosSite.writeObject("\n");
		 oosSite.flush();
		 oosSite.close();
		
		 /*Write data in the passwords related file */
		 
		 FileOutputStream outPass = new FileOutputStream("passes.txt",true) ; 
		 ObjectOutputStream oosPass = new ObjectOutputStream(outPass ) ;
		 oosPass.writeObject(this.passWr);
		 oosPass.writeObject("\n");
		 oosPass.flush();
		 oosPass.close(); 
		 
	}
        
        public void WriteMyData(String user, String password, String key1, String key2) throws IOException
        {
       /*Write data in the sites related file */
            
         try
         {
             
             File file = new File("users.oop");
             if(!file.exists())
             {
                 file.createNewFile();
             }
             
             //Appent to file 
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(user + "\n");
            bw.flush();
            
            file = new File("lenoqua.oop");
            if(!file.exists())
             {
                 file.createNewFile();
             }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(password + "\n");
            bw.flush();
            
            file = new File("ignite.oop");
            if(!file.exists())
             {
                 file.createNewFile();
             }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(key1 + "\n");
            bw.flush();
            
            System.out.println("ACHTUNG !!! " + key2);
            bw.write(key2.substring(key1.length()) + "\n");
 
            bw.flush();

         }
         catch(IOException e)
         {
             e.printStackTrace();
         }
	}
    
    
    
    
    
}
        
