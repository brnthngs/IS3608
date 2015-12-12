/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankATM;

import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class ATM 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        User aUser = theAccount.addUser();
        Account newAccount = new Account();
        
        User curUser;
        while (true)
        {
            curUser = ATM.mainMenu();
            ATM.printUserMenu(curUser, sc);
        }
        
        
    }
    
    
}
