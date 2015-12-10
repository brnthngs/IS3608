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
public class OverLoadedMethods 
{

/**
 * @param args
 */
public static void main(String[] args) {
    // TODO Auto-generated method stub

    Integer[] integerArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    Character[] charArray = {'a', 'b', 'c', 'd'};

    System.out.println("A has: ");
    printArray(integerArray);
    System.out.println("B has: ");
    printArray(doubleArray);
    System.out.println("C has: ");
    printArray(charArray);
}

public static <T> void printArray(T[] array)
{
    for(T element : array)
        System.out.printf("%s ", element);//why use %s instead of others? 

    System.out.println();
}

}    
}
