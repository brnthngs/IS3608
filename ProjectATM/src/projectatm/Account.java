/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wetteb
 */
public class Account implements Serializable
{
    private String acctName;
    private String acctNumber;
    private User holder;
    private ArrayList<Transaction> transactions;
    
    public Account(String acctName, User holder)
    {
        this.acctName = acctName;
        this.holder = holder;
        this.transactions = new ArrayList<Transaction>();
    }
    
}
