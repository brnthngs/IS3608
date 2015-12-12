/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevTestEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class RunStudent2ArrayListsRevenge
{

    public static void main(String[] args)
    {
               
       RunStudent2ArrayListsRevenge sa2 = new RunStudent2ArrayListsRevenge();     
       sa2.initStu();
    }
       
    public void initStu()
    {
          
            String id;
            float ex1, ex2;
            Scanner sc = new Scanner(System.in);
            //Student[] sarray = new Student[3];
            ArrayList<Student> alstu = new ArrayList<>();
               
               
            for(int i=0; i<alstu.size(); i++)
            {
                
                //sarray[i] = new Student();
                alstu.add(1, new Student());

            }
                       
        System.out.print("Enter ID#: [0,1 or 2]: ");
        id = sc.next();
        alstu.add(Integer.parseInt(id), new Student());
        System.out.print("Enter Exam 1: ");
        ex1 = sc.nextFloat();
        System.out.print("Enter Exam 2: ");
        ex2 = sc.nextFloat();
                       
        System.out.println("Please enter your number: ");
        int x = sc.nextInt();
        /*sarray[x].setID(id);
        sarray[x].setExam1(ex1);
        sarray[x].setExam2(ex2);
        sarray[x].showAll();
        sarray[x].showGrades();*/
               
        alstu.get(x).setExam1(ex1);
        alstu.get(x).setExam2(ex1);
        alstu.get(x).showAll();
        
        }
}// end class StudentArray