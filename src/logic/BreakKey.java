/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Octavian
 */
public class BreakKey {
    private int key;
    public int[] result;
    
    public BreakKey(int key)
    {
        this.key = key;
    }
    
    public int[] breakKey()
    {
        result = new int[keyCount()];
        int local = key;
        for(int i = keyCount() - 1; i >= 0; i--)
        {
           result[i] = local % 10;
           local = local / 10;
        }
       return result;
    }
    
    private int keyCount()
    {
        int count = 0;
        int local = key;
        while(local != 0)
        {
            local = local/10;
            count++;
        }
        return count;
    }
    
    public void typeResult()
    {
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(" " + result[i]);
        }
    }
}
    

