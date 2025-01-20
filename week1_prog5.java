/*a Java program to manage stock information for multiple products. The program
should store the product name, product price, and quantity in separate onedimensional arrays for n items. 
The user should be able to specify which products they want to purchase and the desired quantity for each.
Based on the user’s input, the program should generate and display the total bill.*/ 
import java.util.*;
public class week1_prog5
{
    public static void main(String[] args) 
    {
        int i,total=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("OWNER Input:");
        System.out.println("Total Products:");
        int n=sc.nextInt();
        String[] name = new String[n];
        int price[]=new int[n];
        int qty[]=new int[n];
        int rem[]=new int[n];
        int t[]=new int[n];

        for(i=0;i<n;i++)
        {
            System.out.println("Input name:");
            name[i]=sc.next();
            System.out.println("Input price:");
            price[i]=sc.nextInt();
            System.out.println("Input quantity:");
            qty[i]=sc.nextInt();
            
        }

        System.out.println("Display:");
        for(i=0;i<n;i++)
        {
            System.out.println("Name:");
            System.out.println(name[i]);
            System.out.println("Price:");
            System.out.println(price[i]);
            System.out.println("Quantity:");
            System.out.println(qty[i]);
        }
        System.out.println("OWNER Input:");
        for(i=0;i<n;i++)
        {
            System.out.println("Name:");
            System.out.println(name[i]);
            System.out.println("Input quantity to be purchased:");
            t[i]=sc.nextInt();
            while(t[i]>qty[i])
            {
                System.out.println("Input more than available retry:");
                t[i]=sc.nextInt();
            }
            rem[i]=qty[i]-t[i];
            total+=t[i]*price[i];
        }
        System.out.println("BILL:");
        for(i=0;i<n;i++)
        {
            System.out.println("Name:");
            System.out.println(name[i]);
            System.out.println("Price:");
            System.out.println(price[i]);
            System.out.println("Quantity        purchased:");
            System.out.println(t[i]);
System.out.println("Remaining Quantity:");
            System.out.println(rem[i]);
        }
        System.out.println("Total bill is= "+ total);
    }
}







