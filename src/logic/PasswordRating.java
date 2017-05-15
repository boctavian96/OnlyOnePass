/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Laur
 */

public class PasswordRating {

	//private static String pass="CocoJambo33@";
	private char[] cpass;
	//static final String lm = "abcdefghijklmnopqrstuvwxyz";
	//static final String lM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//static final String nr = "0123456789";
	//static final String sb = "!@#$%^&*";
	
	private int NrCaractere=0, LiteraMica=0, LiteraMare=0, Numere=0, Simboluri=0, Conditii=0, Rating=0;
        private float rating; 
	
	public PasswordRating(String pass){
		cpass = pass.toString().toCharArray();
		NrCaractere = cpass.length;
		if(NrCaractere < 8)
			System.out.println("Parola este prea scurta.");
		else{
			for(int i = 0; i < cpass.length; i++)
			{
				if((cpass[i] >= '0')&&(cpass[i] <= '9'))
					Numere = Numere + 1;
				if((cpass[i]=='!')||(cpass[i]=='@')||(cpass[i]=='#')||(cpass[i]=='$')||(cpass[i]=='%')||(cpass[i]=='^')||(cpass[i]=='&')||(cpass[i]=='*'))
					Simboluri = Simboluri + 1;
				if((cpass[i] >= 'a')&&(cpass[i] <= 'z'))
					LiteraMica = LiteraMica + 1;
				if((cpass[i] >= 'A')&&(cpass[i] <= 'Z'))
					LiteraMare = LiteraMare + 1;
			}
			if(NrCaractere > 0)
				Conditii = Conditii + 1;
			if(Numere > 0)
				Conditii = Conditii + 1;
			if(Simboluri > 0)
				Conditii = Conditii + 1;
			if(LiteraMica > 0)
				Conditii = Conditii + 1;
			if(LiteraMare > 0)
				Conditii = Conditii + 1;
			
			Rating = (NrCaractere*4)+((cpass.length-LiteraMare)*2)+((cpass.length-LiteraMica)*2)+(Numere*4)+(Simboluri*6)+(Conditii*2);
			
			System.out.println("Parola:"+pass);
			System.out.println("Caractere:"+NrCaractere);
			System.out.println("Numere:"+Numere);
			System.out.println("Litere mici:"+LiteraMica);
			System.out.println("Litere mari:"+LiteraMare);
			System.out.println("Simboluri:"+Simboluri);
			System.out.println("Conditii indeplinite:"+Conditii);
			System.out.println("Rating-ul parolei:"+Rating);
			
		}
	}
        public float getRating()
        {
            return rating;
        }

}
//working in progress 70%
