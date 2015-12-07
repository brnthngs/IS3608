/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;

import java.io.*;
import java.text.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author bpwc0b
 */
public class Account implements Serializable //only if printing out file
{
    Scanner sc = new Scanner(System.in);
    protected double balance;
    protected int firstdate;
    protected int seconddate;
    protected Calendar cal1 = new GregorianCalendar();
    protected Calendar cal2 = new GregorianCalendar();
    protected boolean dateflag = false;
    protected double rate;
    String menuItem;
    int accountSelection;
    int acctArray[] = new int[3];

    public void Deposit()
    {
        System.out.println("You are in Deposit");
    }
    public void Withdraw()
    {
        System.out.println("You are in Withdraw");
    }
    public void CheckBalance()
    {
        System.out.println("You are in Check Balance");
    }
    public void mainMenu()
    {
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
        System.out.println("|         3.  Delete your Facebook Page         |");
        System.out.println("|                                               |");
        System.out.println("|-----------------------------------------------|");
        menuItem = sc.next();
        
        switch (Integer.parseInt(menuItem)) 
            {
            case 1:
                System.out.println("You have selected your current Account:");
                accountMenu();
            break;
            case 2:
                System.out.println("You have selected to create a new Account:");
                createAccount();
            break;
            case 3:
                System.out.println("Please hold, we are currently deleting your facebook account:");
                a1.mainMenu();
            break;
            default:
                System.out.println("Invalid menu choice, please make another selection.");
            break;
            }
        }
        a1.mainMenu();   
    }
    public void createAccount()
    {
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
            balance = 100.00; 
            rate = 0.05;
            System.out.println("Your starting balance is $100.00");
            System.out.println("Your starting interest rate is 5%");
            break;
            }  
        }
    }

    public void accountSelect()
    {
        System.out.println("Please select your account");
        System.out.println("1:" + acctArray[0] );
        System.out.println("2:" + acctArray[1] );
        System.out.println("3:" + acctArray[2] );
        accountSelection = sc.nextInt();
        
        if (accountSelection == 1)
        {
            
        }
        
    }
        
    public void accountMenu()   
    {
        boolean quit = false;
        do 
        {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|         Welcome to your Bank Account:         |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|            Choose an option below:            |");
        System.out.println("|                                               |");
        System.out.println("|             1.  Deposit                       |");
        System.out.println("|             2.  Withdraw                      |");
        System.out.println("|             3.  Check Balance                 |");
        System.out.println("|            99.  Exit                          |");
        System.out.println("|-----------------------------------------------|");
        menuItem = sc.next();    
            switch (Integer.parseInt(menuItem)) 
                {
                case 1:
                    System.out.println("You have choosen to deposit:");
                    Deposit();
                break;
                case 2:
                    System.out.println("You have choosen to withdraw:");
                    Withdraw();
                break;
                case 3:
                    System.out.println("You have choosen to check your balance:");
                    CheckBalance();
                    break;
                case 99:
                    quit = true;
                break;
                default:
                    System.out.println("Invalid menu choice, please make another selection.");
            } 
        }
        while (!quit);
        System.out.println("Exit");
    }

    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .05/365;
        double ratetime = Math.pow(1+rate,datediff);
        balance = balance * ratetime;
        firstdate = seconddate;

    }

    public void getDate1() throws IOException 
    {
        
        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
                //Date date= new Date();
        Date mydate = formatter.parse(inputText, pos);

        
        cal1.setTime(mydate);

        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
    }
}
