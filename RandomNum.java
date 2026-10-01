import java.util.*;
public class RandomNum
{
    public static void main(int num)
    {
        int random=0;
        for(int i=0;i<=num;i++)
        {
            random=(int)(Math.random()*10)+10;
            
        }
        if(random==13)
        {
            System.out.println("13 is found");
        }
        else
        {
            System.out.println("13 is not found");
        }
    }
}