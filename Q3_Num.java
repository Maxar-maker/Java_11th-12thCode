import java.util.*;
public class Q3_Num
{
    public static void main(int n1,int n2)
    {
        int max=0;
        int min=0;
        int GDC=0;
        if(n1>n2)
        {
            max=n1;
            min=n2;
        }
        else
        {
            min=n1;
            max=n2;
        }
        for(int i=1;i<=max;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                GDC=i;
            }
        }
        System.out.println(GDC);
    }
}