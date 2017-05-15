/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Octavian
 */
public class SecurityRating {
 
    public float RateMySecurity()
    {
        PasswordRating pr;
        String[] passwords = {"test", "test2", "Bla"};
        float r = 0;
        ArrayList<Float> ratings;
        ratings = new ArrayList<Float>();
        
        for(String i : passwords)
        {
            pr = new PasswordRating(i);
            ratings.add(pr.getRating());
        }
        
        for(float i : ratings)
        {
            r += i;
        }
        
        r = r/ratings.size();
        
        //Parse Password   
        return r;
    }
}