/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adelina
 */
public class DataReader {
    private String passRd;
	private String siteRd;
	void ReadMyData(String pass) throws IOException, ClassNotFoundException
	{
	 File passPath = new File("passes.oop");
	 File sitePath = new File("sites.oop");
	Scanner scannerPass = new Scanner(passPath);
	Scanner scannerSite = new Scanner(sitePath);	
	
		  int lineNumber = 1,passLine=0;
		  
	        while(scannerSite.hasNextLine())
	        {
	        	this.siteRd = (String)scannerSite.nextLine();
	            lineNumber++;	          
	            if(this.siteRd.equals(pass))
	            {
	            	passLine=lineNumber;
	            }
	                        
	        }
	        
	        scannerSite.close();
	        
	        while(passLine>1)
	        {
	        	this.passRd = (String)scannerPass.nextLine();   
	        	passLine--;
	                      
	        }
	        scannerPass.close();
	}
    
    
}
