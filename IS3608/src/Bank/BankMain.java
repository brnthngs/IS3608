/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Benjamin
 */
import java.util.ArrayList;
import java.util.Scanner;

    public class BankMain
    {
        private double availableBal =80;
        private double totalBal =100;

        static ArrayList<Integer> cardNum = new ArrayList<Integer>();
        static Scanner input = new Scanner(System.in);

        private String error;           //String the error from the exception
        {
            error = "error";
        }
        public static void cardNumbers(){
            Scanner input = new Scanner(System.in);
            try{

            System.out.println("Please select a 5 digit card number");
            int num = input.nextInt(); 
            checkNumber(num);
            }
            catch(invalidNumber err){

                System.out.println("Caught Error: " + err.getError());
                contC();    
            }
    }
            public static void contC(){
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Type 'c' to enter number again.");

                String value = keyboard.next();
                if(value.equalsIgnoreCase("c")){
                    cardNumbers();

        }

        else if (!keyboard.equals('c')){

            System.out.println("Invalid Entry!");
        }
}
    public static void menu(){

    System.out.println("ATM Menu:");
    System.out.println();
    System.out.println("1 = Create Account");
    System.out.println("2 = Account Login");
    System.out.println("3 = Exit ATM");
    query();
                }

        public void startAtm()
        {
            menu();
        }
        public void drawMainMenu()
        {
            AccountMain main3 = new AccountMain();
            int selection;

            System.out.println("\nATM main menu:");
            System.out.println("1 - View account balance");
            System.out.println("2 - Withdraw funds");
            System.out.println("3 - Add funds");
            System.out.println("4 - Back to Account Menu");
            System.out.println("5 - Terminate transaction");
            System.out.print("Choice: ");
            selection = input.nextInt();

            switch(selection)
            {
            case 1:
                viewAccountInfo();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                addFunds();
                break;
            case 4:
                AccountMain.selectAccount();
                break;
            case 5:
                System.out.println("Thank you for using this ATM!!! goodbye");
            }
        }

        public void viewAccountInfo()
        {
            System.out.println("Account Information:");
            System.out.println("\t--Total balance: $"+totalBal);
            System.out.println("\t--Available balance: $"+availableBal);
            drawMainMenu();
        }

        public void deposit(int depAmount)
        {
            System.out.println("\n***Please insert your money now...***");
            totalBal =totalBal +depAmount;
            availableBal =availableBal +depAmount;
        }

        public void checkNsf(int withdrawAmount)
        {
            if(totalBal -withdrawAmount < 0)
                System.out.println("\n***ERROR!!! Insufficient funds in you accout***");
            else
            {
                totalBal =totalBal -withdrawAmount;
                availableBal =availableBal -withdrawAmount;
                System.out.println("\n***Please take your money now...***");
                }
        }

        public void addFunds()
        {
            int addSelection;

            System.out.println("Deposit funds:");
            System.out.println("1 - $20");
            System.out.println("2 - $40");
            System.out.println("3 - $60");
            System.out.println("4 - $100");
            System.out.println("5 - Back to main menu");
            System.out.print("Choice: ");
            addSelection =input.nextInt();

            switch(addSelection)
            {
            case 1:
                deposit(20);
                drawMainMenu();
                break;
            case 2:
                deposit(40);
                drawMainMenu();
                break;
            case 3:
                deposit(60);
                drawMainMenu();
                break;
            case 4:
                deposit(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
            }
        }

        public void withdraw()
        {
            try{


            int withdrawSelection;

            System.out.println("Withdraw money:");
            System.out.println("1 - $20");
            System.out.println("2 - $40");
            System.out.println("3 - $60");
            System.out.println("4 - $100");
            System.out.println("5 - Back to main menu");
            System.out.print("Choice: ");
            withdrawSelection =input.nextInt();

            switch(withdrawSelection)
            {
            case 1:
                checkAmount(20);
                drawMainMenu();
                break;
            case 2:
                checkAmount(40);
                drawMainMenu();
                break;
            case 3:
                checkAmount(60);
                drawMainMenu();
                break;
            case 4:
                checkAmount(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
             default:             
                    System.out.println("Invalid choice.");
                    withdraw();
            }

            }
            catch(invalidAmount err){
                System.out.println("Caught Error: " + err.getError());
                viewAccountInfo();
            }
        }

public static void query(){

    Scanner keyboard = new Scanner(System.in);


    while (!keyboard.hasNextInt()) {
        System.out.println("Invalid choice.");
        menu();
    }
    int input = keyboard.nextInt();

    if (input == 2){

        BankMainPart2 main2 = new BankMainPart2();

        System.out.println("Please enter your 5 digit card number.");
        BankMainPart2.loginCard(cardNum);
    }
    else if (input == 1){

        cardNumbers();  
    }
    else if (input == 3){
        System.out.println("Thank you, have a nice day!");
        System.exit(0);
    }
}


private static void checkNumber(int num) throws invalidNumber
//run the check activation exception
{
    Scanner keyboard = new Scanner(System.in);

    if(String.valueOf(num).length()!=5)
  {
        throw new invalidNumber("invalid number");
  }
    else  {

        cardNum.add(num);

        System.out.println("Thank you! You're card number is " +num);
        contC2();
    }
}
    private void checkAmount(int withdrawAmount) throws invalidAmount
    //run the check activation exception
    {
        if(totalBal -withdrawAmount < 0)
        {   
            throw new invalidAmount("\n***ERROR!!! Insufficient funds in you accout***");
    }
    else
        {
            totalBal =totalBal -withdrawAmount;
            availableBal =availableBal -withdrawAmount;
            System.out.println("\n***Please take your money now...***");
            }
    }
    public static void contC2(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type 'c' to return to main menu.");

        String value = keyboard.next();
        if(value.equalsIgnoreCase("c")){
        menu();
        }
        else if (!keyboard.equals('c')){
            System.out.println("Invalid Entry!");
            contC2();
        }
    }
    public static void main(String args[])
    {
        BankMain myAtm = new BankMain();
        BankMainSub sub = new BankMainSub();
        myAtm.startAtm();
    }
}