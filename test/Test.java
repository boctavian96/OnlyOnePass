/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import logic.Manager;
/**
 * Aceasta clasa va fi folosita pentru testare
 * @author Octavian
 */
public class Test {
    
    public static void main(String args[])
    {     
        
        Manager mng = new Manager();
        
        System.out.println(mng.generatePassword(14));
        mng.insertAccount("ana", "don");
        mng.insertAccount("baron", "password");
        System.out.println(mng.getMyUsername(0));
        System.out.println(mng.getMyPassword(0));
    
        
        System.out.println(mng.getMyUsername(1));
        System.out.println(mng.getMyPassword(1));
        
        
    }
    
}
