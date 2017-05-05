/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import logic.GenerareParola;
//import logic.EncryptionAlgorithms.ZEncryption;
import logic.Decrypter;
import logic.Encrypter;
/**
 * Aceasta clasa va fi folosita pentru testare
 * @author Octavian
 */
public class Test {
    
    public static void main(String args[])
    {
        Encrypter e = new Encrypter("boc", "g55326116g");
        Decrypter d = new Decrypter(e.getKUser(), e.getUsername());
        
        System.out.println(e.getUsername());
        System.out.println(d.startDecr());
    }
    
}
