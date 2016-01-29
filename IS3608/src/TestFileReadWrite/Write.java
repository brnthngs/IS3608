package TestFileReadWrite;

import java.io.*;
public class Write 
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("./file.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Test x = new Test("testing", 37);
            Test y = new Test();
            y.str = "testing";
            y.ivalue = 37;
            oos.writeObject(y);
            oos.flush();
            fos.close();
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }
    }
}
