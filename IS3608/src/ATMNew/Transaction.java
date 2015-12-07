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
public class Transaction 
{
    /**
     * the amount of this transaction
     */
    private double amount;  
    /**
     * the time and date of this transaction
     */
    private Date timestamp;
    /**
     * a memo for details of this transaction
     */
    private String memo;
    
    /**
     * The account in which this transaction was performed
     */
    private Account inAccount;
    
    /**
     * 
     * @param amount
     * @param inAccount 
     */
    public Transaction(double amount, Account inAccount)
    {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    /**
     * Create a new Transaction
     * @param amount
     * @param memo
     * @param inAccount 
     */
    public Transaction(double amount, String memo, Account inAccount)
    {
            // call the two-arg constructor first
            this(amount, inAccount);
            
            // set the memo
            this.memo = memo;
    
    }
    /**
     * Get the amount of the transaction
     * @return 
     */
    public double getAmount()
    {
        return this.amount;
    }
    
}
