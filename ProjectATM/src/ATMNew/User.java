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

import java.util.*;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class User 
{
    private String firstName; 
    /**
    * The first name of the user
    */
    private String lastName;  
    /**
     * The last name of the user
    */
    
    private String uuid;
    /**
     * the ID number of the user
     */
    
    private byte pinHash[];  
    /**
     * the MD5 hash of the user's pin number
     */
    
    private ArrayList<Account>accounts;  
    /**
     * the list of accounts of this user
     */
    
    /**
     * Create a new user
     * @param firstName the user's first name
     * @param lastName  the user's last name
     * @param pin       the user's account pin number
     * @param theBank   the Bank object that the user is a customer of
     */
    
    //constructor
    public User(String firstName, String lastName, String pin, Bank theBank)
    {
    //sets user's name
    this.firstName = firstName;
    this.lastName = lastName;
    
        try {
            // store the pin's MD5 hash, rather than the original value, for security reasons
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("error, caught NoSucnAlgorithmException");
            //e.printStackTrace();
            System.exit(1);
        }
        
        // get a new, unique universal ID for the user
        this.uuid = theBank.getNewUserUUID();
        
        // create empty list of accounts
        this.accounts = new ArrayList<Account>();
        
        // print log message
        System.out.printf("New user %s, %s with ID %s created\n", lastName, 
                firstName, this.uuid);
    
    }
    
    public void addAccount(Account anAcct)
    {
        this.accounts.add(anAcct);
    }

    /**
     * @return the uuid
     */
    public String getUUID() {
        return this.uuid;
    }
    
    /**
     * 
     * @param aPin
     * @return 
     */
    public boolean validatePin(String aPin)
    {
        try {
            // store the pin's MD5 hash, rather than the original value, for security reasons
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()),
                    this.pinHash);
        } catch (NoSuchAlgorithmException ex) 
        {
            System.err.println("error, caught NoSucnAlgorithmException");
            //e.printStackTrace();
            System.exit(1);
        }
        return false;
    }
    /**
     * Get first name
     * @return 
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Print summaries for the accounts of this user
     */
    public void printAccountsSummary()
    {
        System.out.printf("\n\n%s's acounts summary\n", this.firstName);
        for (int a = 0; a < this.accounts.size(); a++)
        {
            System.out.printf("  %d) %s\n", a+1, 
                    this.accounts.get(a).getSummaryLine());
        }
        System.out.println();
    }
    /**
     * Get the number of accounts of the user
     * @return  the number of accounts
     */
    public int numAccounts()
    {
        return this.accounts.size();
    }
    /**
     * Print transaction history for a particular account.
     * @param acctIdx 
     */
    public void printAcctTransHistory(int acctIdx)
    {
        this.accounts.get(acctIdx).printTransHistory();
    }
    
    /**
     * Get the balance of a particular account
     * @param acctIdx   the index of the account to use
     * @return          the balance of the account
     */
    public double getAcctBalance(int acctIdx)
    {
        return this.accounts.get(acctIdx).getBalance();
    }
    
    /**
     * Get the UUID of a particular account
     * @param acctIdx   the index of the account to use
     * @return          the UUID of the account
     */
    public String getAcctUUID(int acctIdx)
    {
        return this.accounts.get(acctIdx).getUUID();
    }
    
    public void addAcctTransaction(int acctIdx, double amount, String memo)
    {
        this.accounts.get(acctIdx).addTransaction(amount, memo);
    }
}
