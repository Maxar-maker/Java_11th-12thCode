import java.util.*;
public class Bin_Deci
{
    int s=0;
    public int rec(String n,int a)
    {
        if(n.charAt(a)=='0')
        {
            return rec(n,a-1);
        }
        else if(n.charAt(a)=='1')
        {
            s+=Integer.parseInt(n.charAt(a))*Math.pow(2,a);
            return rec(n,a-1);
        }
    }
    public static void main(String s)
    {
        Bin_Deci ob=new Bin_Deci();
        ob.rec(s,);
    }
}
