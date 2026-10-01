import java.util.*;
public class BianrySc
{
    public static void main(int arr[],int find)
    {
        int s=0;
        int f=arr.length;
        int mid=0;
        boolean cc=false;
        while(s<=f)
        {
            mid=(s+f)/2;
            if(find>arr[mid])
            {
                s=mid+1;
            }
            else if(find<arr[mid])
            {
                f=mid-1;
            }
            else
            {
                System.out.println("Yes");
                System.out.println("index at:"+mid);
                cc=true;
                break;
            }
        }
        if(cc)
        {
            
        }
        else
        {
            System.out.println("Not found");
        }
    }
}