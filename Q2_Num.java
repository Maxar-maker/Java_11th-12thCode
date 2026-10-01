import java.util.*;
public class Q2_Num
{
    public static void main(int num)
    {
        int sum=0;
        int temp=num;
        int cc=0;
        String str="";
        while(num>0)
        {
            cc++;
            num/=10;
        }
        str=Integer.toString((temp));
        str+=(Integer.toString((temp)*2));
        str+=(Integer.toString((temp*3)));
        String arr[]={"1","2","3","4","5","6","7","8","9"};
        boolean c=true;
        if(str.length()==9)
        {
            for(int i=0;i<9;i++)
            {
                if(arr[i].equals((str.charAt(i))))
                {
                    arr[i]="#";
                }
            }
            c=true;
            for(int i=0;i<9;i++)
            {
                if(arr[i].equals("#"))
                {
                    c=false;
                }
            }
        }
        else
        {
            c=false;
        }
        if(c)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}