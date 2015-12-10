/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMNew;

/**
 *
 * @author Benjamin
 */

import java.util.Scanner;
public class ATM 
{
    public static void main(String[] args)
    {
        // init Scanner
        Scanner sc = new Scanner(System.in);
        
        // init Bank
        Bank theBank = new Bank("Bank of Drausin");
        
        // add a user, which also creates a savings account
        User aUser = theBank.addUser("John", "Doe", "1234");
        
        // add a checking account for new user
        Account newAccount = new Account("Checking", aUser, theBank);
        theBank.addAccount(newAccount);
        
        User curUser;
        while (true) 
        {
            // stay in the login prompt until successful login
            curUser = ATM.mainMenuPrompt(theBank, sc);
            
            // stay in the main menu until user quits
            ATM.printUserMenu(curUser, sc);
        }
    }
    /**
     * 
     * @param theBank
     * @param sc
     * @return 
     */
    public static User mainMenuPrompt(Bank theBank, Scanner sc)
    {
        //inits
        String userID;
        String pin;
        User authUser;
        
        // prompt user for user ID/pin combo until a correct one is reached
        do
        {
            System.out.printf("\n\nWelcone to %s\n\n", theBank.getName());
            System.out.print("Enter user ID: ");
            userID = sc.nextLine();
            System.out.print("Enter pin: ");
            pin = sc.nextLine();
            
            // try to get the user object corresponding to the ID and pin combo
            authUser = theBank.userLogin(userID, pin);
            if(authUser == null)
            {
                System.out.println("Incorrect user ID/pin combination." + 
                        "Please try again.");
            }
        }
        while (authUser == null); //continue looping until successful login
        return authUser;
    }
    
    public static void printUserMenu(User theUser, Scanner sc)
    {
        // print a summary of the user's accounts
        theUser.printAccountsSummary();
        
        //init
        int choice;
        
        // user menu
        do 
        {
            System.out.printf("Welcome %s, what would you like to do?\n",
                    theUser.getFirstName());
                    System.out.println("");
                    System.out.println("1) Show acount transaction history");
                    System.out.println("2) Withdraw");
                    System.out.println("3) Deposit");
                    System.out.println("4) Transfer");
                    System.out.println("5) Exit");
                    System.out.print("Enter Chioce: ");
                    choice = sc.nextInt();
                    
                    if (choice < 1 || choice > 5)
                    {
                        System.out.println("Invalid choice.  Please choos 1-5");
                    }
        }
        while (choice <1 || choice >5);
        
        // process the choice
        switch (choice)
        {
            case 1:
                ATM.showTransHistory(theUser, sc);
                break;
            case 2:
                ATM.withdrawFunds(theUser, sc);
                break;
            case 3:
                ATM.depositFunds(theUser, sc);
                break;
            case 4:
                ATM.transferFunds(theUser, sc);
                break;
                
        }
        // redisplay this menu unless the user wants to quit
        if (choice !=5)
        {
            ATM.printUserMenu(theUser, sc);
        }
    }
    
    /**
     * Show the transaction history for an account
     * @param theUser   the logged in User object
     * @param sc        the Scanner object used for user input
     */
    public static void showTransHistory(User theUser, Scanner sc)
    {
        int theAcct;
        // get account whose transatcion history we want to look at
        do
        {
        System.out.printf("Enter the number (1-%d) of the account\n" + 
                " whose transactions you want to see: ", 
                theUser.numAccounts());
        theAcct = sc.nextInt()-1;
        if (theAcct <0 || theAcct >= theUser.numAccounts())
        {
            System.out.println("Invalid account.  Please try again. ");
        }
        }
        while(theAcct <0 || theAcct >= theUser.numAccounts());
        
        //print the transaction history
        theUser.printAcctTransHistory(theAcct);
        
    }
    public static void transferFunds(User theUser, Scanner sc)
    {
        // inits
        int fromAcct;
        int toAcct;
        double amount;
        double acctBal;
        
        //get the account to transfer from
        do
        {
            System.out.printf("Enter the number (1-%d) of the account\n" + 
                    "to transfer from: ");
            fromAcct = sc.nextInt()-1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts())
            {
                System.out.println("Invalid account. Please try again.");
            }
        }
        while(fromAcct <0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);
        
        // get the account to transfer to
        do
        {
            System.out.printf("Enter the number (1-%d) of the account\n" + 
                    "to transfer to: ");
            toAcct = sc.nextInt()-1;
            if (toAcct < 0 || toAcct >= theUser.numAccounts())
            {
                System.out.println("Invalid account. Please try again.");
            }
        }
        while(toAcct <0 || toAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(toAcct);
        
        // get the amount to to transfer
        do
        {
            System.out.printf("Enter the amount to transfer (max $%.02f): $", 
                    acctBal);
            amount = sc.nextDouble();
            if(amount < 0)
            {
                System.out.printf("Amount must be greater than zero,");
            }
            else if (amount > acctBal)
            {
                System.out.printf("Amount must not be greater than\n" + 
                        "balance of $%.02f", acctBal);
            }
            
            System.out.println("Amount must be greater than zero.");
        }
        while (amount <0 || amount > acctBal);
        // finally do the transfer
        theUser.addAccountTransaction(fromAcct, -1*amount, String.format(
                "Transfer to account %s", theUser.getAcctUUID(toAcct)));
        theUser.addAccountTransaction(toAcct, amount, String.format(
                "Transfer to account %s", theUser.getAcctUUID(fromAcct)));
    }
    
    /**
     * Proces a fund withdraw from an account
     * @param theUser   the logged in User object
     * @param sc        the Scanner object user for user input
     */
    public static void withdrawFunds(User theUser, Scanner sc)
    {
        // inits
        int fromAcct;
        double amount;
        double acctBal;
        String memo;
        
        //get the account to transfer from
        do
        {
            System.out.printf("Enter the number (1-%d) of the account\n" + 
                    "to transfer from: ");
            fromAcct = sc.nextInt()-1;
            if (fromAcct < 0 || fromAcct >= theUser.numAccounts())
            {
                System.out.println("Invalid account. Please try again.");
            }
        }
        while(fromAcct <0 || fromAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(fromAcct);
        
        // get the amount to to transfer
        do
        {
            System.out.printf("Enter the amount to transfer (max $%.02f): $", 
                    acctBal);
            amount = sc.nextDouble();
            if(amount < 0)
            {
                System.out.printf("Amount must be greater than zero,");
            }
            else if (amount > acctBal)
            {
                System.out.printf("Amount must not be greater than\n" + 
                        "balance of $%.02f", acctBal);
            }
            
            System.out.println("Amount must be greater than zero.");
        }
        while (amount <0 || amount > acctBal);
        
        //Clear scanner
        System.out.println("Enter a memo: ");
        memo = sc.nextLine();
        
        // do the withdraw
        theUser.addAcctTransaction(fromAcct, -1*amount, memo);
    }
    /**
     * Deposit funds into account
     * @param theUser
     * @param sc 
     */
    public static void depositFunds(User theUser, Scanner sc)
    {
        
        // inits
        int toAcct;
        double amount;
        double acctBal;
        String memo;
        
        //get the account to transfer from
        do
        {
            System.out.printf("Enter the number (1-%d) of the account\n" + 
                    "to transfer from: ");
            toAcct = sc.nextInt()-1;
            if (toAcct < 0 || toAcct >= theUser.numAccounts())
            {
                System.out.println("Invalid account. Please try again.");
            }
        }
        while(toAcct <0 || toAcct >= theUser.numAccounts());
        acctBal = theUser.getAcctBalance(toAcct);
        
        // get the amount to to transfer
        do
        {
            System.out.printf("Enter the amount to transfer (max $%.02f): $", 
                    acctBal);
            amount = sc.nextDouble();
            if(amount < 0)
            {
                System.out.printf("Amount must be greater than zero,");
            }
            else if (amount > acctBal)
            {
                System.out.printf("Amount must not be greater than\n" + 
                        "balance of $%.02f.\n", acctBal);
            }    
        }
        while (amount <0 || amount > acctBal);
        
        //Clear scanner
        System.out.println("Enter a memo: ");
        memo = sc.nextLine();
        
        // do the deposit
        theUser.addAcctTransaction(toAcct, amount, memo);
    }
}
