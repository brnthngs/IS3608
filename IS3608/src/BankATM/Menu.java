/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankATM;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class Menu 
{
    
    Scanner sc = new Scanner(System.in);
    
    Bank bank = new Bank();
    private boolean exit;
    
    
    public void runMenu()
    {
        printHeader();
        while(!exit)
        {
                printMenu();
                int choice = getInput();
                performActions(choice);
                
        }
        System.out.println("Welcome to the ATM");
        System.out.println("Please identify yourself");
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        
        System.out.println("Hello " + firstName + lastName + "Thank you for "
                + "choosing My ATM:");
        
    }

    private void printHeader() 
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private void printMenu() {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    private int getInput() {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    private void performActions(int choice) {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }
}
