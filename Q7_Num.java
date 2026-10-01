import java.util.*;
public class Q7_Num
{
    public static void main(int num)
    {
        
        int temp=num;
        String str="";
        while(num>0)
        {
            if(num%2==0)
            {
                str+="0";
            }
            else
            {
                str+="1";
            }
            num/=10;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        int cc=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(sb.substring(i,i+1).equals("1"))
            {
                cc++;
            }
        }
        System.out.println("Input"+temp);
        System.out.println("Binary"+sb);
        System.out.println("No.of 1ś"+cc);
        if(cc%2==0)
        {
            System.out.println(temp+" Yes it is a Evil Number");
        }
        else
        {
            System.out.println(temp+"   No it is not a Evil Number");
        }
    }
}