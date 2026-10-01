import java.util.*;
public class SubsitutionCipher
{
    public static void main(String word)
    {
        String cipher="";
        String nospace="";
        int sp=0;
        int n=0;
        while(n<word.length())
        {
            if(word.charAt(n)==' ')
            {
                n++;
                continue;
            }
            nospace=nospace+word.charAt(n);

            n++;
        }
        int a=0;
        int b=0;
        for(int i=n/2;i>1;i--)
        {
            if(n%i==0)
            {
                a=i;
                break;
            }
        }
        b=n/a;
        char arr[][]=new char[a][b];
        int temp=0;
        for(int i=0;i<b;i++)
        {
            for(int y=0;y<a;y++)
            {
               arr[y][i]=nospace.charAt(temp); 
               temp++;
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int y=0;y<b;y++)
            {
               cipher=cipher+arr[i][y]; 
            }
        }
        System.out.println(cipher);
    }
}