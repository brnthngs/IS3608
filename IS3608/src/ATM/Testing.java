/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import TestFileReadWrite.Test;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class Testing 
{
    public static void main(String[] args)
    {
        int[] acctArray = new int[3];
        Scanner sc = new Scanner(System.in);
        int i;
        for (i=0; i < acctArray.length; i++)
        {
            System.out.println("Your have been assigned a new accout");
            System.out.println("Congratulations on your new account!");
            acctArray[i] = i + 1;
            System.out.println("Please enter your First Name");
            String firstName = sc.next();
            System.out.println("Please enter your Last Name");
            String lastName = sc.next();
            System.out.println("Account " + acctArray[i] + " belongs to " + firstName + " " + lastName);
            double balance = 100.00; 
            double rate = 0.05;
            System.out.println("Your starting balance is $100.00");
            System.out.println("Your starting interest rate is 5%");
        }  
                try
        {
            FileOutputStream fos = new FileOutputStream("./CreateAccount.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Test x = new Test("testing", 37);
            Testing y = new Testing();
            y.firstName = "firstName";
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
