import java.util.*;
public class Q4_Num
{
    public static boolean prime(int n1)
    {
        int cc=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                cc++; 
            }
        }
        if(cc==2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(int n1,int n2)
    {
        int rec=0;
        int l=0;
        if(prime(n1))
        {
            rec=n1;
            for(int i=n1;i<=n2;i++)
            {
                if(prime(i))
                {
                    l=i;
                    if(rec+2==l)
                    {
                    System.out.println("("+rec+","+l+")");
                    rec=l;
                    l=0;
                    }
                    
                }
            }
        }
        else
        {
            for(int i=n1;i<n2;i++)
            {
                if(prime(i))
                {
                    rec=i;
                    break;
                }
            }
            for(int i=rec;i<=n2;i++)
            {
                if(prime(i))
                {
                    l=i;
                    if(rec+2==l)
                    {
                    System.out.println("("+rec+","+l+")");
                    rec=l;
                    l=0;
                    }
                    
                }
            }
        }
        
    }
}