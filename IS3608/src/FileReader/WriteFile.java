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
public class WriteFile {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "AccountArray.txt";

        try {
            // Assume default encoding.
            FileWriter fw =
                new FileWriter(fileName, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fw);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");
            bufferedWriter.newLine();

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
