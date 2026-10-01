import java.util.*;
public class Program_1
{
    public static void main(int a,int b,int op)
    {
        System.out.println("Choose operator:   1:+,2:-,3:*,4:/");
        switch(op)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
        }
    }
}