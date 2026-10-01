import java.util.*;
public class Palendrome
{
    public static void main(int num)
    {
        int mod=0;
        int rev=0;
        int temp=num;
        while(num>0)
        {
            mod=num%10;
            rev=(rev+mod)*10;
            num/=10;
        }
        rev=rev/10;
        if(temp==rev)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}