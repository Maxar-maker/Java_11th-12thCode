import java.util.*;
public class SelectionSort
{
    public static void main()
    {
        int arr[]={5,4,8,12,1,3};
        int min=0;
        int min_i=0;
        int temp=0;
        for(int i=0;i>arr.length;i++)
        {
            min=arr[i];
            for(int j=i;j>arr.length;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    min_i=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min_i];
            arr[min_i]=temp;
        }
        for(int val:arr)
        {
            System.out.print(val);
        }
    }
}