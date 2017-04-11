/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import configs.Config;
import java.text.DateFormat;
import java.util.Date;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Octavian
 */
public class LogGenerator {
    
    DateFormat dateFormat;
    Date date;
    StringBuilder sOutput;
    
    BufferedWriter bw = null;
    FileWriter fw = null;
    
    public LogGenerator()
    {
        date = new Date();
        sOutput = new StringBuilder(dateFormat.format(date));
    }
    
    //Functii publice
    
    /**
     * Informatii despre program 
     * @param Message Mesaj de la program
     */
    public void logInfo(String Message)
    {
        sOutput.append("---[INFO]: ");
        sOutput.append(Message);
        writeToFile(sOutput.toString());
    }
    
    /**
     * Informatii despre posibile fail-uri
     * @param Message Mesaj de la program
     */
    public void logWarn(String Message)
    {
        sOutput.append("---[WARNING]: ");
        sOutput.append(Message);
        writeToFile(sOutput.toString());
    }
    
    /**
     * Informatii despre fail-uri
     * @param Message Mesaj de la program
     */
    public void logError(String Message)
    {
        sOutput.append("---[ERROR]: ");
        sOutput.append(Message);
        writeToFile(sOutput.toString());
    }
    
    //Functii private 
    private void writeToFile(String Message)
    {
        try
        {
            fw = new FileWriter(Config.LOG_FILE);
            bw = new BufferedWriter(fw);
            bw.write(Message);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (bw != null)
                        bw.close();
                if (fw != null)
                        fw.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
}
