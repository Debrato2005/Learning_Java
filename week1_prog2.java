/*a java program to add two numbers using the bitwise operator and check if the
output is an even or odd number. [Hint: use left shift and right shift bitwise operators].*/
import java.util.*;
public class week1_prog2
{
    public static void main(String[] args) 
    {
        int sum=0, carry=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the first number:");
        int n1=sc.nextInt();
        System.out.println("Input the second number:");
        int n2=sc.nextInt();
        while(n2!=0)
        {
            carry=n1&n2;
            n1=n1^n2;
            n2=carry<<1;
        }
        sum=n1;
        System.out.println("Sum= "+sum); 
        if((sum&1)!=0)
        {
            System.out.println("It's ODD"); 
        }
        else{
            System.out.println("It's EVEN"); 
        }
    }
}