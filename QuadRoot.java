import java.util.*;
public class QuadRoot
{
    static double  r1=0;
    static double  r2=0;
    public static void Quad(int a,int b,int c)
    {
        r1=(-b+(Math.sqrt(b*b)-(4*a*c))/(2*a));
        r2=(-b-(Math.sqrt(b*b)-(4*a*c))/(2*a));
        System.out.println(r1);
        
        if(r1==r2)
        {
            System.out.println("Only 1 sol");
            System.out.println(r2);
        }
        else
        {
            System.out.println("2 sol");
            System.out.println(r2);
            System.out.println(r1);
        }
    }
    public static void main(int a,int b,int c)
    {
        if(((b*b)-(4*a*c))>=0)
        {
            Quad(a,b,c);
        }
        else
        {
            System.out.println("No solution");
        }
    }
}
