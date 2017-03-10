package logic;

import java.security.SecureRandom;
import configs.Config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Octavian
 */
public class GenerareParola {
   

	// eu am considerat ca o parola este mai puternica daca are si un caracter de tip !@#$%^&* :)
	//static final String CARACTERE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*";
	static SecureRandom random = new SecureRandom();
	private static char[] cpass;
	
	public GenerareParola(int lungime)
	{
            purgeCpass();
		if(lungime < 1)
			throw new IllegalArgumentException("Lungimea prea mica.(<1)"); //arunca exceptie
		else if(lungime < 4) //eu cred ca o parola trebuie sa aibe minim 4 caractere
			System.out.println("Parola este prea scurta.");
		else
		{
			StringBuilder sb = new StringBuilder(lungime); //formarea string-ului
			for(int i = 0; i < lungime; i++)
				//pentru fiecare pozitie i se randomizeaza unul dintre caractere si se adauga la sirul final
				sb.append(Config.CARACTERE.charAt(random.nextInt(Config.CARACTERE.length()))); 
                        
			// aici am folosit cpass pentru a converti string-ul in char pentru a fi mai usor de folosit
			// la alte functii/clase :)
			cpass = sb.toString().toCharArray();
                                
		}
	}
        
        public char[] getPass()
        {
            return cpass;
        }
        
        private void purgeCpass()
        {
            cpass = null;
        }
	
}
