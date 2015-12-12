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
    int acctNumber;
    Account a1 = new Account();
    Scanner sc = new Scanner(System.in);
    Account[] acct = new Account[3];

    /**
     * Main method, inits the program
     * @param args  
     */
    public static void main(String [] args) 
    {
        ATM a = new ATM();
 //       Account a1 = new Account();
        a.mainMenu();
        
        
    }
    /**
     * First menu presented to user
     */
    public void mainMenu()
    {
        
        int menuItem;
        Scanner sc = new Scanner(System.in);
        
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
                selectAcct();
            break;
            case 2:
                System.out.println("You have selected to create a new Account:");
                createAcct();
            break;
            default:
                System.out.println("Invalid menu choice, please make another "
                        + "selection.");
            break;
            }
        }
       
    }
    /**
     * 
     */
    public void createAcct()
    {
        int i;
        String input;
        for (i = 0; i < acct.length -1; i++);
        {
            //Account act = new Account();
            acctNumber = i;
            acct[i] = new Account();
            
            System.out.println("Please enter your First Name");
            String firstName = sc.next();
            System.out.println("Please enter your Last Name");
            String lastName = sc.next();
            acct[i].setAcctName(lastName,acctNumber);
            System.out.println("Account " + acct[i] + " belongs to " + firstName + " " + lastName);
            a1.balance = 100.00; 
            a1.rate = 0.05;
            System.out.println("Your starting balance is $100.00");
            System.out.println("Your starting interest rate is 5%");
            a1.acctMenu();
//            System.out.println(this.acct);
        }
    }
    
    /**
     *
     */
    public void selectAcct()
    {
        int menuInput;
       
        System.out.println("Please enter your account number");
        menuInput = sc.nextInt();
        if (menuInput != 0 || menuInput != 1 || menuInput != 2)
        {
            System.out.println("Please enter a valid account number");
            menuInput = sc.nextInt();
        }
        else
        {

            a1.acctMenu();
        }
 
    }
   
}
        //Account[] acctArray = new Account[3];
        //Scanner sc = new Scanner(System.in);
        //int i;
        //for (i=0; i < acctArray.length; i++)
//            {
//            System.out.println("Your have been assigned a new accout");
//            System.out.println("Congratulations on your new account!");
//          // acctArray[i] = i++;


//            ATM.mainMenu();
//            }  
//        }
//    }
//	

//
//
