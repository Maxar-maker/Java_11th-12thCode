import java.util.*;
public class Armstrong
{
    public static int sum(int num,int cc)
    {
        int mod=0;
        int sum=0;
        while(num>0)
        {
            mod=num%10;
            num/=10;
            sum+=Math.pow(mod,cc);
        }
        return sum;
    }
    public static int digit(int num)
    {
        int mod=0;
        int cc=0;
        while(num>0)
        {
            mod=num%10;
            num/=10;
            cc++;
        }
        return cc;
    }
    public static void main(int num)
    {
        if(num==sum(num,digit(num)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
