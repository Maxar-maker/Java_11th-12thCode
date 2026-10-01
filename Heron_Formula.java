import java.util.*;
public class Heron_Formula
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s=(a+b+c)/3;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area:"+area);
    }
}