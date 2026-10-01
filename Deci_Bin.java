import java.util.*;
public class Deci_Bin
{
    public void rec(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            rec(n/2);
            System.out.println(n%2);
        }
    }
    public static void main(int n)
    {
        Deci_Bin ob=new Deci_Bin();
        ob.rec(n);
    }
}
