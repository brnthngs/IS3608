/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

/**
 *
 * @author Benjamin
 */
    import java.util.Scanner;
    import java.util.Random;
    public class seu03Methods
{
    public static int seu03Menu()
    {
    int option = 0;
    Scanner console = new Scanner(System.in);   
    System.out.println("-------------------------------------");
    System.out.println("|         Welcome to seu03!         |");
    System.out.println("|-----------------------------------|");
    System.out.println("| Choose an option below:           |");
    System.out.println("|                                   |");
    System.out.println("| 1.  Calculator                    |");
    System.out.println("| 2.  Sentence Analysis             |");
    System.out.println("| 3.  Roll a 6-sided die            |");
    System.out.println("| 4.  Play Big Money!               |");
    //System.out.println("| 5. randomRange            |");
    //System.out.println("| 6. stubMethod            |");
    System.out.println("| 9.  Exit                          |");
    System.out.println("-------------------------------------");
    option = console.nextInt();
    return option;
    }
    public static void calcuator()
    {
        System.out.println("You picked calculator");
    }
    public static void sentenceAnalysis()
    {
    Scanner console = new Scanner(System.in);
    String userString = new String("");
    System.out.println("-------------------------------------");
    System.out.println("Please enter a sentence for analysis:");
    userString = console.nextLine();
    System.out.println("The sentence to analyze is: " + userString);
    System.out.println("The sentence is " + userString.length() + " characters long.");
    System.out.println("The first character of the sentence is " + userString.charAt(0));
    System.out.println("The middle charchter of the sentence is " + userString.charAt(userString.length()/2));
    System.out.println("The last character of the sentence is " + userString.charAt(userString.length()-1));
    System.out.println("Thanks for using our 1323 System!");
    System.out.println("-------------------------------------");
    return;
    } //end of sentenceAnalysis
    public static void rollDice()
    {
    Random gener = new Random();
    int die = 0;
    System.out.println("-------------------------------------");
    System.out.println("Welcome to Roll Dice!");
    System.out.println("The program will now roll a single six-sided die.");
    die = gener.nextInt(6) + 1;
    System.out.println("Result: " + die);
    System.out.println("Thanks for using our 1323 System!");
    System.out.println("-------------------------------------");
    return;
    } //end of rollDice
    public static void bigMoney()
    {
    Scanner console = new Scanner(System.in);
    Random gener = new Random();
    int rnum = 0;
    int guess1 = 0;
    int guess2 = 0;
    int guess3 = 0;
    System.out.println("-------------------------------------");
    System.out.println("Welcome to Big Money!");
    rnum = gener.nextInt(10) + 1;
    System.out.println("A whole number between 1 and 10 inclusive has been generated. You will have three chances to guess the number.");
    System.out.println("Here is the random number for testing purposes: " + rnum);
    System.out.println("What is your first guess?");
    guess1 = console.nextInt();
    if(guess1 == rnum)
        {
        System.out.println(" Big Money! You win $100!");
        }
    else
        {
        System.out.println("No good! What is your second guess?");
        guess2 = console.nextInt();
            if(guess2 == rnum)
            {
            System.out.println("Medium Money! You win $50!");
            }
            else
                {
                System.out.println("No good! What is your third guess?");
                guess3 = console.nextInt();
                    if(guess3 == rnum)
                    {
                    System.out.println("Little Money! You win $1!");
                    }
                        else
                        {
                        System.out.println("Sorry! You didn't win any money this time. Better luck next time!");
                        }
                }
            }   
    System.out.println("Thanks for playing Big Money!");
    System.out.println("Thanks for using our 1323 System!");
    System.out.println("-------------------------------------");
    return;
    } //end of bigMoney
} //end of class