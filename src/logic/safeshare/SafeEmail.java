/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.safeshare;

/*
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
*/

/**
 *
 * @author Octavian
 */
public class SafeEmail {
    private String to;
    private String from;
    
    public SafeEmail(String[] args)
    {
        to = args[0];
        from = args[1];
    }
    
    public void sendSafe()
    {
        //Sending E-mail
    }
        
}
