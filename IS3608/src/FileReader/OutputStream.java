/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader;
import java.io.*;
/**
 *
 * @author bpwc0b
 */
public class OutputStream{
    public static void main(String [] args) {

        // The name of the file to create.
        String fileName = "temp.txt";

        try {
            // Put some bytes in a buffer so we can
            // write them. Usually this would be
            // image data or something. Or it might
            // be unicode text.
            String bytes = "Hello theren";
            byte[] buffer = bytes.getBytes();
            FileOutputStream FileOutputStream = new FileOutputStream("./IsThisHere.txt");

            // write() writes as many bytes from the buffer
            // as the length of the buffer. You can also
            // use
            // write(buffer, offset, length)
            // if you want to write a specific number of
            // bytes, or only part of the buffer.
            FileOutputStream.write(buffer);

            // Always close files.
            FileOutputStream.close();       

            System.out.println("Wrote " + buffer.length + 
                " bytes");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
