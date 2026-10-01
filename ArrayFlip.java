import java.util.*;
public class ArrayFlip
{
    public static void main()
    {
        int arr[]={1,2,3,4,5,6,7};
        int half=Math.round(arr.length/2);
        int temp=0;
        int n=0;
        int f=0;
        while(n<=half)
        {
            temp=arr[f];
            arr[f]=arr[f+half];
            arr[f+half]=temp;
            f++;
            n++;
        }
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}