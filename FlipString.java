import java.util.*;
public class FlipString
{
    public static void main(String n)
    {
        n=n.trim();
        n=" "+n+" ";
        String str="";
        String str1="";
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)==' ')
            {
                if(i+1<n.length())
                {
                    for(int j=i+1;j<n.length();j++)
                    {
                        if(n.charAt(j)==' ')
                        {
                            str=n.substring(i+1,j);
                            for(int a=str.length()-1;a>=0;a--)
                            {
                                str1+=str.charAt(a);
                            }
                            System.out.print(str1);
                            System.out.print(" ");
                            str="";
                            str1="";
                            break;
                        }
                    }
                }
            }
        }
    }
}