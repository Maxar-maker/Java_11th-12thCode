import java.util.*;
public class Sum_Digit
{
    
    public static int digit(int num)
    {
        int mod=0;
        int sum=0;
        while(num>0)
        {
            mod=num%10;
            num/=10;
            sum+=mod;
        }
        return sum;
    }
    public static void main(int num)
    {
        System.out.println(digit(num));
    }
}
