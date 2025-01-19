/*a Java program to rotate the elements of an array to the right/left by a given
number of steps. The program should handle arrays of different sizes and should be
able to rotate the array in both directions (left and right).*/ 
import java.util.*;
public class week1_prog4
{
    public static void main(String[] args) 
    {
        int i,t,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("Input the limit:");
        int lim=sc.nextInt();
        int a[]=new int[lim];

        System.out.println("Input the array:");
        for(i=0;i<lim;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Input array is: [ ");
        for(i=0;i<lim;i++)
        {
            System.out.print(a[i]+ " ,");
        }
        System.out.println(" ]");

        System.out.println("Input rotation direction:");
        char dir = Character.toUpperCase(sc.next().charAt(0));
        System.out.println("Input rotation by :");
        int n=sc.nextInt();
        n=n%lim;

        if (dir=='R')
        {
            for (j = 1; j <= n; j++)
            {
            t=a[lim-1];
            for(i=0;i<lim-1;i++)
            {
                a[lim-i-1]=a[lim-i-1-1];
            }
            a[0]=t;
            }
        }
        else if (dir=='L')
        {
            for (j = 1; j <=n; j++)
            {
            t=a[0];
            for(i=0;i<lim-1;i++)
            {
                a[i]=a[i+1];
            }
            a[lim-1]=t;
            }
        }
        else 
        {
            System.out.println("Wrong Input.");
        }

        System.out.print("Output array is: [ ");
        for(i=0;i<lim;i++)
        {
            System.out.print(a[i]+ " ,");
        }
        System.out.print(" ]");
    }
}