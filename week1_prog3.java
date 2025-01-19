/*Write a Java program to execute the following statements. Observe and analyze the
outputs.
a. int x =10; b. double x = 10.5;
c. double x=10.5;
double y = x; int y = x;
int y = (int) x
System.out.println(y); System.out.println(y);
System.out.println(y);*/
public class week1_prog3 {
    public static void main(String[] args) 
    {
        int x1=10;
        double y1=x1;
        System.out.println("x1= "+x1);

        double x2=10.5;
        double y2=x2;
        System.out.println("x2= "+x2);

        double x3=10.5;
        int y3=x3;
        System.out.println("x3= "+x3);

        int x4=10.5;
        int y4=(int)x4;
        System.out.println("x4= "+x4);

    }
}

}