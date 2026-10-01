import java.util.*;
public class RailFenceCipher
{
    String s1="";
    String s2="";
    String s3="";
    public void encrypt()
    {
        String str="WeFoundYouRun";
        for(int i=0;i<str.length();i+=4)
        {
            s1+=str.charAt(i);
        }
        //System.out.println(s1);
        for(int i=1;i<str.length();i+=2)
        {
            s2+=str.charAt(i);
        }
        //System.out.println(s2);
        for(int i=2;i<str.length();i+=4)
        {
            s3+=str.charAt(i);
        }
        //System.out.println(s3);
    }
    public void print_encrypt()
    {
        System.out.print(s1.charAt(0)+"  ");
        for(int i=1;i<s1.length();i++)
        {
            System.out.print("  "+s1.charAt(i)+"   ");
        }
        System.out.println();
        for(int i=0;i<s2.length();i++)
        {
            System.out.print(" "+s2.charAt(i)+" ");
        }
        System.out.println();
        for(int i=0;i<s3.length();i++)
        {
            System.out.print("  "+s3.charAt(i)+"   ");
        }
        System.out.println();
    }
    public int max()
    {
        int max=0;
        if(s1.length()>s2.length())
        {
            if(s1.length()>s3.length())
            {
                max=s1.length();
            }
            else
            {
                max=s3.length();
            }
        }
        else
        {
            if(s2.length()>s3.length())
            {
                max=s2.length();
            }
            else
            {
                max=s3.length();
            }
        }
        return max;
    }
    public void decrypt()
    {
        RailFenceCipher ob=new RailFenceCipher();
        int max=ob.max();
        int cc=0;
        char arr[][]=new char[3][18];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<max;j++)
            {
                arr[i][j]='0';
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<18;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<18;i+=4)
        {
            arr[0][i]=s1.charAt(cc);
            cc++;
            if(s1.length()==cc)
            {
                break;
            }
        }
        cc=0;
        for(int i=1;i<18;i+=2)
        {
            arr[1][i]=s2.charAt(cc);
            cc++;
            if(s2.length()==cc)
            {
                break;
            }
        }
        cc=0;
        for(int i=2;i<18;i+=3)
        {
            arr[2][i]=s3.charAt(cc);
            cc++;
            if(s3.length()==cc)
            {
                break;
            }
        }
               
        
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<18;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        RailFenceCipher ob=new RailFenceCipher();
        ob.encrypt();
        ob.decrypt();
    }
}