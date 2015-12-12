/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

/**
 *
 * @author bpwc0b
 */

    import java.util.ArrayList;
import java.util.Scanner;

public class FruitTest 
{
public static void main(String[] args) {

     TheMenu();

 }

public static void TheMenu()
{


         String Customer[] = new String[10]; 

     Scanner input = new Scanner(System.in);

          String option; 
          do {   // loop back to here as long as Q isn't selected           
              System.out.println("\nMenu");
              System.out.println("V: Views all fruit");
              System.out.println("A: To add a fruit to the list");
          System.out.println("Q: To exit");

          option = input.next();  

          if (option.charAt(0) == 'V' ) 
          { 
              viewAllFruit(Customer);
              } 


          if (option.charAt(0) == 'A' ) 
          { 
              AddFruit(Customer);
          }

          }
          while (option.charAt(0) != 'Q');

          }


    public static void viewAllFruit(String CustomerRef[])
    {
        ArrayList<String> theFruit = new ArrayList<String>();

        theFruit.add("Plums");
        theFruit.add("Grapes");
        theFruit.add("Oranges");
        theFruit.add("Prunes");
        theFruit.add("Apples");

         int size = theFruit.size();
        for (int x = 0; x<size; x++) //for loop for fruits
        {            
            System.out.println("Fruit " + x + " is in stock " + theFruit);   
        }
        }

public static void AddFruit(String CustomerRef[])

{

    Scanner input = new Scanner(System.in);

    ArrayList<String> theFruit = new ArrayList<String>();

    theFruit.add("Plums");
    theFruit.add("Grapes");
    theFruit.add("Oranges");
    theFruit.add("Prunes");
    theFruit.add("Apples");

    System.out.println("Enter the fruits you'd like to add and EE to exit");
    String choice = input.next();

    String EE = "Goodbye!";

    if (choice !=EE);
    {
        theFruit.add(choice);
        choice = input.next();

    }

    for (String S : theFruit)

    {
        System.out.println(S);
    }


}
}
    
    
    

