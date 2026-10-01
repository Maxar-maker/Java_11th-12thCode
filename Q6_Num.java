import java.util.*;
public class Q6_Num
{
    public static void main(int num)
    {
        boolean cc=false;
        for(int i=0;i<num-1;i++)
        {
            if(i*(i+1)==num)
            {
                cc=true;
            }
        }
        if(cc)
        {
            System.out.println(num+" is a Pronic number");
        }
        else
        {
            System.out.println(num+" is not a Pronic number");
        }
    }
}