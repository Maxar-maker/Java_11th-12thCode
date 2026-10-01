import java.util.*;
public class CeaserCipher
{
    public static void main(String word,int jump)
    {
        String cipher="";
        int num=word.length();
        int n=0;
        int madd=0;
        int dadd=0;
        while(n<num)
        {
            if((word.charAt(n)+jump)>'Z')
            {
               for(int i=word.charAt(n);i<='Z';i++)
               {
                   dadd++;
               }
               madd=jump-dadd;
               cipher=cipher+((char)('A'+madd));
            }
            else
            {
                cipher=cipher+((char)(word.charAt(n)+jump));
            }
            n++;
        }
        System.out.println(cipher);
    }
}