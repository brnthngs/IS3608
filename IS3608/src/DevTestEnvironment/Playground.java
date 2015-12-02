/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

import java.util.Scanner;
import java.util.Random;
public class Playground
{
public static void main (String[] args)
{
int option = 0;
option = seu03Methods.seu03Menu();
    while(option != 9)
        {
switch (option)
    {
    case 1:
        seu03Methods.calcuator();
        break;
    case 2:
        seu03Methods.sentenceAnalysis();
        break;
    case 3:
        seu03Methods.rollDice();
        break;
    case 4:
        seu03Methods.bigMoney();
        break;
    case 9:
        System.out.println("Exiting seu03...");
        System.exit(0);
        break;
    default:
        System.out.println("Invalid selection.");
        break;
    }
            }
} //end of main
} //end of class