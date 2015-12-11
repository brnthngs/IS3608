/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATM;


import Benjamin.*;
import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class ATM 
{
   
    /**
     * Main method, inits the program
     * @param args  
     */
    public static void main(String [] args)
    {
        mainMenu();
        
    }
    /**
     * First menu presented to user
     */
    public static void mainMenu()
    {
        
        int menuItem;
         Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|            Welcome to WWSYM Bank!             |");
        System.out.println("|         (We Will Steal Your Money LLC)        |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|            Choose an option below:            |");
        System.out.println("|                                               |");
        System.out.println("|         1.  Access your current Account       |");
        System.out.println("|         2.  Create a new Account              |");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("|-----------------------------------------------|");
        menuItem = sc.nextInt();
        
        switch (menuItem) 
            {
            case 1:
                System.out.println("You have selected your current Account:");
                a1.acctMenu();
            break;
            case 2:
                System.out.println("You have selected to create a new Account:");
                a1.createAcct();
            break;
            default:
                System.out.println("Invalid menu choice, please make another "
                        + "selection.");
            break;
            }
        }
       
    }
}


