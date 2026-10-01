import java.util.*;
public class Q5_Num
{
    public static void main(int num)
    {
        int sum=0;
        int temp=num;
        int cc=0;
        int temp1=num;
        while(temp>0)
        {
            cc++;
            temp/=10;
        }
        
        while(num>0)
        {
            sum+=Math.pow((num%10),cc);
            cc--;
            num/=10;
        }
        if(temp1==sum)
        {
            System.out.println(temp1+"Yes it is a Disarium Number");
        }
        else
        {
            System.out.println(temp1+"No it is not a Disarium Number");
        }
    }
}