/*a Java program to accept the number of hours worked, hourly rate and calculates
the salary for an employee according to the following criteria: The company pays
straight time for the first 40 hours worked by each employee and time and a half for
all hours worked in excess of 40 hours.*/
import java.util.*;
public class week1_prog1
{
    public static void main(String[] args) 
    {
        double pay=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of hours worked:");
        double hrs=sc.nextDouble();
        System.out.println("Input hourly rate:");
        double rate=sc.nextDouble();
        if (hrs<=40)
        {pay=hrs*rate;}
        else if(hrs>40)
        {pay=(40+1.5*(hrs-40))*rate;}
        System.out.println("Salary= "+pay);        
    }
}
