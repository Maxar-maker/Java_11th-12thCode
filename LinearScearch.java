import java.util.*;
public class LinearScearch
{
    public static void main(int find)
    {
        int arr[]={1,2,3,4,5,6,7};
        int mid=arr.length/2;
        int l=0;
        int f=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(find==arr[i])
            {
                System.out.println("Found");
                System.exit(0);
            }
        }
        System.out.println("Not Found");
        
    }
}