package edu.umsl.is3806;

public class Student
{
    //String Fname; //will use later
    //String Lname; //will use later
    private int exam1;
    private int exam2;
    private double avg;
    
    
   
    
    
    
    public void studentAvg()
    {
           avg = ((double)getExam1() + getExam2()) /2;
           System.out.println("Your average is: " + avg);
           
    }   

    /**
     * @return the exam1
     */
    public int getExam1() {
        return exam1;
    }

    /**
     * @param exam1 the exam1 to set
     */
    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    /**
     * @return the exam2
     */
    public int getExam2() {
        return exam2;
    }

    /**
     * @param exam2 the exam2 to set
     */
    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }
}
