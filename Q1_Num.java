import java.util.*;
public class Q1_Num
{
    public static void main(int num)
    {
        int sum=0;
        int temp=num;
        while(num>0)
        {
            sum+=(num%10);
            num/=10;
        }
        if(temp%sum==0)
        {
            System.out.println(temp+"Yes it is a Harshad Number");
        }
        else
        {
            System.out.println(temp+"No it is not a Harshad Number");
        }
    }
}