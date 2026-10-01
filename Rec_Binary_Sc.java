import java.util.*;
public class Rec_Binary_Sc
{
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    public int rec(int s,int l,int f)
    {
        int m=(s+l)/2;
        if(s>l)//Base case is 1st
        {
            return -1;
        }
        else if(arr[m]>f)
        {
            return rec(s,m-1,f);
        }
        else if (arr[m]<f)
        {
            return rec(m+1,l,f);
        }
        else if(arr[m]==f)
        {
            return m;
        }
        
        else
        {
            return -1;
        }
    }
    public static void main(int f)
    {
        Rec_Binary_Sc ob=new Rec_Binary_Sc();
        System.out.println(ob.rec(0,9,f));
    }
}
