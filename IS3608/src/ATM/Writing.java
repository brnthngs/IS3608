/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATM;

/**
 *
 * @author bpwc0b
 */
//public class Savings 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Writing 
{
    public void writing() 
    {
        try 
        {
            //Whatever the file path is.
            File statText = new File("./statsTest.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write("POTATO!!!");
            w.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }
}
//    public static void main(String[]args) 
//    {
//        Writing write = new Writing();
//        write.writing();
//    }

    
    

