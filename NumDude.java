import java.util.*;
public class NumDude
{
    int num;
    public NumDude()
    {
        num=0;
    }
    public void input(int n)
    {
        num=n;
    }
    public int sumDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return (n%10)+ sumDigits(n/10);
        }
    }
    public void isDude()
    {
        if(num==(Math.pow(sumDigits(num),3)))
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
    }
    public static void main(int n)
    {
        NumDude obj=new NumDude();
        obj.input(n);
        obj.isDude();
    }
}