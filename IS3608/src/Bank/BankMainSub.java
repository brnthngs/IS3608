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
public class BankMainSub extends BankMain {

    private double availableBal3 =500;
    private double totalBal3 =520;

    public void businessAccount()
    {
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
            viewAccountInfo3();
            break;
        case 2:
            withdraw3();
            break;
        case 3:
            addFunds3();
            break;
        case 4:
            AccountMain.selectAccount();
            break;
        case 5:
            System.out.println("Thank you for using this ATM!!! goodbye");
         default:             
                System.out.println("Invalid choice.");
                businessAccount();

        }
            }


    public void addFunds3()
    {
        int addSelection;

        System.out.println("Deposit funds:");
        System.out.println("1 - $20");
        System.out.println("2 - $40");
        System.out.println("3 - $60");
        System.out.println("4 - $100");
        System.out.println("5 - Back to main menu");
        System.out.print("Choice: ");
        addSelection = input.nextInt();

        switch(addSelection)
        {
        case 1:
            deposit2(20);
            businessAccount();
            break;
        case 2:
            deposit2(40);
            businessAccount();
            break;
        case 3:
            deposit2(60);
            businessAccount();
            break;
        case 4:
            deposit2(100);
            businessAccount();
            break;
        case 5:
            businessAccount();
            break;
        }
    }

    public void withdraw3()
    {
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
            checkNsf3(20);
            businessAccount();
            break;
        case 2:
            checkNsf3(40);
            businessAccount();
            break;
        case 3:
            checkNsf3(60);
            businessAccount();
            break;
        case 4:
            checkNsf3(100);
            businessAccount();
            break;
        case 5:
            businessAccount();
            break;
        }
    }

    public void viewAccountInfo3()
    {

        System.out.println("Account Information:");
        System.out.println("\t--Total balance: $"+totalBal3);
        System.out.println("\t--Available balance: $"+availableBal3);
        businessAccount();
    }

    public void deposit2(int depAmount)
    {
        System.out.println("\n***Please insert your money now...***");
        totalBal3 =totalBal3 +depAmount;
        availableBal3 =availableBal3 +depAmount;
    }

    public void checkNsf3(int withdrawAmount)
    {
        if(totalBal3 -withdrawAmount < 0)
            System.out.println("\n***ERROR!!! Insufficient funds in you accout***");
        else
        {
            totalBal3 =totalBal3 -withdrawAmount;
            availableBal3 =availableBal3 -withdrawAmount;
            System.out.println("\n***Please take your money now...***");
            }
    }
}