package TestFileReadWrite;


// read.java
import java.io.*;
public class Read
{
    public static void main(String args[])
    {
        Test testobj = null;
        try
        {
                FileInputStream fis = new FileInputStream("E:/file.out");
                ObjectInputStream ois = new ObjectInputStream(fis);
                testobj = (Test)ois.readObject();
                fis.close();
        }
        catch (Throwable e)
        {
                System.err.println(e);
        }
        System.out.println(testobj.str);
        System.out.println(testobj.ivalue);
    }
}
