/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author Adeleena
 */
public class DataWritter {
  	private String pass;
	private String site;
	/**
	 * @param pass
	 * @param site
	 */
	public DataWritter(String pass, String site) {
		this.pass = pass;
		this.site = site;
	}
	void WriteMyData() throws FileNotFoundException
	{
            PrintWriter siteOut;
              try (PrintWriter passOut = new PrintWriter("passes.oop")) {
                  passOut.println((String)this.pass);
                  siteOut = new PrintWriter("sites.oop");
                  siteOut.println((String)this.site);
              }
		 siteOut.close();
	}

    
    
    
    
    
    
}
