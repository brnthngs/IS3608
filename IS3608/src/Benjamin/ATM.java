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
public class ATM 
{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args)
    {
        System.out.println("Press the Enter key for menu: \n");
        Account A1 = new Account();
        A1.mainMenu();
    } 
}


