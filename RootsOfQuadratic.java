import java.util.*;
public class RootsOfQuadratic
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Input value or x2 and x and the C");
        int a=scr.nextInt();
        int b=scr.nextInt();
        int c=scr.nextInt();
        double sol=0;
        double sol1=0;
        if((b*b)-(4*a*c)>0)
        {
            sol=(-b)+Math.sqrt((b*b)-(4*a*c))/(2*a);
            sol1=(-b)-Math.sqrt((b*b)-(4*a*c))/(2*a);
            System.out.println("Solution 1:"+ sol);
            System.out.println("Solution 2:"+ sol1);
        }
        else if((b*b)-(4*a*c)<0)
        {
            System.out.println("Roots are imagary");
        }
        else
        {
            System.out.println("Solution 1:0");
            System.out.println("Solution 2:0");
        }
    }
}