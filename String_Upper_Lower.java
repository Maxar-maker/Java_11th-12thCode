import java.util.*;
public class String_Upper_Lower
{
    public static void main(String a)
    {
        String temp="";
        int b=0;
        int c=0;
        a=" "+a+" ";
        for(int i=0;i<a.length();)
        {
            while(!(a.substring(i,i+1).equals(" ")))
            {
                temp+=a.charAt(i);
                i+=1;
            }
            if(Character.isUpperCase(temp.charAt(0))&&Character.isLowerCase(temp.charAt(temp.length()-1)))
            {
                System.out.println(temp);
                
            }
            temp="";
        }
    }
}