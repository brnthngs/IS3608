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
import java.util.Scanner;

public class AccountMain {


    public static void selectAccount(){


        System.out.println("Which account would you like to access?");
        System.out.println();
        System.out.println("1 = Business Account ");
        System.out.println("2 = Savings Account");
        System.out.println("3 = Checkings Account");
        System.out.println("4 = Return to Main Menu");

        menuAccount();
    }

    public static void menuAccount(){

        BankMain main = new BankMain();
        BankMainSub sub = new BankMainSub();
        BankMainPart3 main5 = new BankMainPart3();

        Scanner account = new Scanner(System.in);
        while (!account.hasNextInt()) {
            System.out.println("Invalid choice.");
            selectAccount();
        }
        int actNum = account.nextInt();


        if (actNum == 1){

            System.out.println("*Business Account*");
            sub.businessAccount();
        }

        else if (actNum == 2){

            System.out.println("*Savings Account*");
            main.drawMainMenu();
        }

        else if (actNum == 3){

            System.out.println("*Checkings Account*");
            main5.checkingsAccount();
        }

        else if (actNum == 4){
            BankMain.menu();

        }
    }
}