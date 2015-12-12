/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl.is3806;

import java.util.Scanner;

/**
 *
 * @author lawtonb
 */
public class RunStudent
{
     public static void main(String[] args)
    {
       Student Katie = new Student();
       Student Ryan = new Student();
       //Katie.exam1 = 75;
       System.out.println("Please enter your exam1 score");
       Scanner sc = new Scanner(System.in);
       int ex1 = sc.nextInt();
       
       Katie.setExam1(ex1);
       System.out.println("I set exam1 to " + Katie.getExam1());
       //Katie.exam2 = 99;
       System.out.println("Please enter your exam2 score");
       int ex2 = sc.nextInt();
       
       Katie.setExam2(ex2);
       Katie.studentAvg();
       
       //Ryan.exam1 = 88;
       System.out.println("Please enter your exam1 score");
       ex1 = sc.nextInt();
       Ryan.setExam1(ex1);
       //Ryan.exam2 = 81;
       Ryan.setExam2(81);
       Ryan.studentAvg();
    }
}
