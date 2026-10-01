import java.util.*;
public class Library_2025_SP
{
    double p;
    int d;
    double f;
    public Library_2025_SP(int day,int p)
    {
        p=0;
        d=day;
        f=0;
    }
    public void fine()
     { 
         if(d>=1&&d<=5)
         {
             f=d*2.0;
         }
         else if(d>=6&&d<=10)
         {
             f=d*3.0;
         }
         else
         {
             f=d*5.0;
         }
     }
    public void show()
    { 
        System.out.println("No.days: "+d);
        System.out.println("fine: "+f);
        System.out.println("Total amt: "+(((0.02*p)*d)+f));
    }
    public static void main(int day,int p)
    {
        Library_2025_SP ob=new Library_2025_SP(day,p);
    }
}