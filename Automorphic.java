import java.util.*;
public class Automorphic
{
    public static void main(int num)
    {
        int mod=0;
        int rev=0;
        int temp=num;
        int n=0;
        int cc=0;
        int rev2=0;
        int sq=(int)Math.pow(num,2);
        int temp1=sq;
        while(sq>0)
        {
            mod=sq%10;
            n++;
            sq/=10;
        }
        
        while(cc<n)
        {
            cc++;
            mod=temp1%10;
            rev=(rev+mod)*10;
            temp1/=10;
        }
        while(num>0)
        {
            mod=num%10;
            rev2=(rev2+mod)*10;
            num/=10;
        }
        rev=rev/100;
        rev2=rev2/10;
        if(rev2==rev)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}