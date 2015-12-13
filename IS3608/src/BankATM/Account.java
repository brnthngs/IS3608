/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankATM;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bpwc0b
 */
public class Account implements Serializable
{
    private String name;
    private ArrayList<Transaction>transactions;
    public Account()
    {
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
        
    }
}
