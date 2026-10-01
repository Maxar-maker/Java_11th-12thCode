import java.util.*;
public class Q3_Arr2D
{
    public static void main(int n)
    {
        int arr[][]=new int[n][n];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
           }
        }
    
        boolean cc=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    cc=false;
                }
           }
        }
        if(cc)
        {
            System.out.println("Symmetric");
        }
        else
        {
            System.out.println("Not Symmetric");
        }
    }
}
