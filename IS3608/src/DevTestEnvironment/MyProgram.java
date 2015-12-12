/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl.is3806;

/**
 *
 * @author lawtonb
 */
public class MyProgram 
{
    public static void main(String args[])
    {
        MyProgram mp = new MyProgram();
        mp.Sum();
        mp.Difference();
        mp.Product();
        mp.Quotient();
        mp.Remainder();
    }

    public void Sum()
    {
        int x = 10;
        int y = 20;
        int z;
        z = x + y;
        System.out.println(z);
    }
    
    public void Difference()
    {
        int x = 10;
        int y = 20;
        int z;
        z = x - y;
        System.out.println(z);
    }
    
    public void Product()
    {
        int x = 10;
        int y = 20;
        int z;
        z = x * y;
        System.out.println(z);
    }
    
    public void Quotient()
    {
        Integer x = 10;
        Double y = 20.0;
        Double z;
        z = x / y;
        System.out.println(z);
    }
    
    public void Remainder()
    {
        Integer x = 10;
        Double y = 20.0;
        Double z;
        z = x % y;
        System.out.println(z);
    }
    
    
}
