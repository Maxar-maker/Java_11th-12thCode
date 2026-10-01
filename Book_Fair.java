import java.util.*;
public class Book_Fair
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int e=0;
        int c=0;
        int m=0;
        int price=0;
        System.out.println("No of books for english");
        e=sc.nextInt();
        System.out.println("No of books for comp");
        c=sc.nextInt();
        System.out.println("No of books for math");
        m=sc.nextInt();
        
        if(e>=2)
        {
            price+=(100*95)/100;
        }
        if(c>=1)
        {
            price+=(100*90)/100;
        }
        if(m>1)
        {
            price+=(100*92)/100;
        }
        System.out.println(price);
    }
}