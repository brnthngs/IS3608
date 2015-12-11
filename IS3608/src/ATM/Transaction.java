/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

/**
 *
 * @author wetteb
 */

import java.io.*;
import java.text.*;
import java.util.*;
import java.lang.*;
public class Transaction 
{
    // amount to be deposited into an account
    double depAmt;
    // amount to be withdrawn from an account
    double withAmt;
    
    public void Deposit(Scanner sc)
    {
    System.out.println("Please enter the deposit amount:");
    depAmt = sc.nextDouble();

    }


    public void Withdraw()
    {
    System.out.println("You are in Withdraw");
    }


    public void CheckBalance()
    {
    System.out.println("You are in Check Balance");
    }


}
