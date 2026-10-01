import java.util.*;
public class Insertion_Deletion
{
    public static void main()
    {
        int arr[]=new int[10];
        int input_i=2;
        int input_val=15;
        for(int i=0;i<5;i++)
        {
            arr[i]=i+1;
        }
        for(int j=6;j>=3;j--)
        {
            arr[j]=arr[j-1];
        }
        arr[input_i]=input_val;
        for(int val:arr)
        {
            System.out.print(val);
        }
        
        
        //deletion
        for(int j=input_i;j<=5;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[6]=0;
        System.out.println();
        for(int val:arr)
        {
            System.out.print(val);
        }
    }
}