import java.util.*;
public class SpiralProgram
{
    public static void main()
    {
        int arr[][]=new int[3][3];
        int n=3;
        int mid=(arr.length/2);
        int c=1;
        int cc=1;
        arr[mid][mid]=1;
        int nmid=mid;
        while(true)
        {
           arr[nmid][nmid+cc]=c;
           c++;
           nmid=mid+cc;
           
           
           arr[nmid-cc][nmid]=c;
           c++;
           cc++;
           
           arr[nmid-cc][nmid]=c;
           
           for(int i=0;i<cc;i++)
           {
               arr[nmid-cc][i]=c;
               c++;
           }
           
           
           for(int i=0;i<cc;i++)
           {
               arr[i][0]=c;
               c++;
           }
           
           
           for(int i=0;i<cc;i++)
           {
               arr[cc][i]=c;
               c++;
           }
           
           
           arr[cc][cc]=c;
           c++;
           cc++;
           
           
           break;
           
           
        }
        
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}