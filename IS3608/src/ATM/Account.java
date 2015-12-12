/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATM;


// import functions from Java API
import java.io.*;
//
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.Writer;


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
    private ArrayList<Transaction> transactions;
    double acctBalance;
    double balanceNew;
    double balanceOld;
    Transaction Tr = new Transaction();

    public void setAcctName(String lastName, int i)
    {
        
        ArrayList<Account>accounts;
       
    }

        //return menuInput;
//      Scanner sc = new Scanner(System.in);
//        accountSelection[i].acctBalance = sc.nextDouble();
//        acctArray[i].acctBalance

    public void acctMenu()
    {
        ATM atm = new ATM();
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
                    System.out.println("You have choosen to check your "
                            + "balance:");
                    CheckBalance(atm);
                    break;
                case 99:
                    quit = true;
                    atm.mainMenu();
                break;
                default:
                    System.out.println("Invalid menu choice, please make another"
                            + " selection.");
            } 
        }
        while (!quit);
        atm.mainMenu();
    }
     
        // amount to be deposited into an account
    double depAmt;
    // amount to be withdrawn from an account
    double withAmt;
    
    public void Deposit()
    {
    System.out.println("Please enter the deposit amount:");
    depAmt = sc.nextDouble();

    }


    public void Withdraw()
    {
    System.out.println("You are in Withdraw");
    }


    public void CheckBalance(ATM balance)
    {
    System.out.println("You are in Check Balance");
    System.out.println("");
    double acctBalance = this.balance;
    System.out.println(this.balance);
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
