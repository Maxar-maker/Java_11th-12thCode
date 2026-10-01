import java.util.*;
public class MergeArray
{
    public static void main()
    {
        int arr1[]={1,2,3,4,8,10};
        int arr2[]={5,6,7,9,11,12};
        int arr3[]=new int[12];
        int m1=6;
        int m2=6;
        int i=0;
        int j=0;
        int a=0;
        while(i<m1&j<m2)
        {
            if(arr1[i]<arr2[j])
            {
               arr3[a]=arr1[i];
               a++;
               i++;
            }
            else
            {
               arr3[a]=arr2[j];
               a++;
               j++;
            }
        }
        while(i<m1)
        {
               arr3[a]=arr1[i];
               a++;
               i++;
        }
        while(j<m2)
        {
               arr3[a]=arr2[j];
               a++;
               j++;
        }
        
        System.out.println(Arrays.toString(arr3));
    }
}