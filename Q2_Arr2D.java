import java.util.*;
public class Q2_Arr2D
{
    public static void main(int n,int m)
    {
        int arr[][]=new int[n][m];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
           }
        }
        int num=-1;
        int num_p=0;
        int max=arr[0][0];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
                num_p=i;
            }
            sum=0;
        }
        int min=arr[num_p][0];
        num=min;
        for(int i=0;i<m;i++)
        {
            if(arr[num_p][i]<min)
            {
                min=arr[num_p][i];
                num=min;
            }
        }
        
        System.out.println("Saddle Point: "+num); 
        
    }
}
