import java.util.*;
public class Frame_Words
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        str=" "+str;
        int cc=str.length();
        int i=0;
        String com="";
        char min=' ';
        char temp=' ';
        while(i<cc)
        {
           if(str.charAt(i)==' ')
           {
             com+=str.charAt(i+1);
           }
           i++;
        }
        System.out.println(com);
        String sort="";
        int min_i=0;;
        for(int j=0;j<com.length();j++)
        {
            min=com.charAt(i);
            for(int a=j;a<com.length();a++)
            {
                if(min>com.charAt(a))
                {
                    min=com.charAt(i);
                    min_i=j;
                }
            }
            sort+=com.charAt(min_i);
        }
    }
}