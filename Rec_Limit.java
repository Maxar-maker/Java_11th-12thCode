import java.util.*;
public class Rec_Limit
{
    public int rec(int n)
    {
        try {
        rec(n+1);
        } catch (StackOverflowError e) {
        System.out.println("Stack overflow occurred!");
        System.out.println(n);
        return n;
        }
        return n;
    }
    public static void main()
    {
        Rec_Limit ob=new Rec_Limit();
        ob.rec(1);
    }
}