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
	private int Condlm=0, CondLM=0, CondSimb=0, CondNr=0, CondCar=0;
	
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
			if(NrCaractere > 8)
			{
				CondCar = CondCar + 1;
				if(CondCar != 0)
					Conditii = Conditii + 1;
			}
			if(Numere > 0)
			{
				CondNr = CondNr + 1;
				if(CondNr != 0)
					Conditii = Conditii + 1;
			}
			if(Simboluri > 0)
			{
				CondSimb = CondSimb + 1;
				if(CondSimb != 0)
					Conditii = Conditii + 1;
			}
			if(LiteraMica > 0)
			{
				Condlm = Condlm + 1;
				if(Condlm != 0)
					Conditii = Conditii + 1;
			}
			if(LiteraMare > 0)
			{
				CondLM = CondLM + 1;
				if(CondLM != 0)
					Conditii = Conditii + 1;
			}
			
			
			//Rating
			Rating = (NrCaractere*4)+((cpass.length-LiteraMare)*2)+((cpass.length-LiteraMica)*2)+(Numere*4)+(Simboluri*6)+(Conditii*2)+(CondCar*2)+(CondNr*4)+(CondSimb*6)+(Condlm*2)+(CondLM*2);
			
			if(Rating <=10)
			{
				System.out.println("Very weak password.");
			}
			else if(Rating <=40)
			{
				System.out.println("Weak password.");
			}
			else if(Rating <=70)
			{
				System.out.println("Good password.");
			}
			else if(Rating <=100)
			{
				System.out.println("Strong password.");
			}
			else if(Rating >100)
				System.out.println("Very strong password.");
			
			//Output
			System.out.println("Parola:"+pass);
			System.out.println("Rating-ul parolei:"+Rating);
			
		}
	}
	public static void main(String[] args) {
		new PasswordRating("CocoJambo33@");

	}

}
//working in progress 95%
