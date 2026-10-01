import java.util.*;
public class Word_Split
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str1=in.nextLine();
        str1=" "+str1+" ";
        int i1=0;
        int i2=str1.indexOf(" ",i1+1);
        System.out.println(str1.substring(i1,i2));
        for(int i=0;i<str1.length();i++)
        {
            i1=str1.indexOf(" ",i+1);
            i2=str1.indexOf(" ",i1);
            System.out.println(str1.substring(i1,i2));
        }
        }
    }
