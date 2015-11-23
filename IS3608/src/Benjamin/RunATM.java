/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;

import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class RunATM 
{
    public static void main(String args[])
    {
    int[] acctArray = new int[3];
    Scanner sc = new Scanner(System.in);
    int i;
    for (i=0; i < acctArray.length; )
    {
    System.out.println("Your new Account number is " + acctArray[i]);
    acctArray[i] = i + 1;
    System.out.println("Please enter your First Name");
    String firstName = sc.next();
    System.out.println("Please enter your Last Name");
    String lastName = sc.next();
    System.out.println("Account " + acctArray[i] + " belongs to " + firstName + " " + lastName);
    }
    i++;
    }
}
