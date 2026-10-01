import java.util.*;
public class BinaryScearch
{
    public static void main(int find)
    {
        int arr[]={1,2,3,4,5,6,7};
        int mid=arr.length/2;
        int l=0;
        int f=0;
        
        while(f<=l)
        {
            if(arr[mid]==find)
            {
                System.out.println("Found");
                System.exit(0);
            }
            else if(arr[mid]>find)
            {
                l=mid-1;
            }
            else
            {
                f=mid+1;
            }
            mid=(f+l)/2;
        }
        System.out.println("Not Found");
        
    }
}