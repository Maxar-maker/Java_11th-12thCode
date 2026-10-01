import java.util.*;
public class Q1_Arr2D
{
    public static void main(int n)
    {
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
           }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
           }
        }
        int arr_res[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for (int k = 0; k < n; k++) 
                { 
                    arr_res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }
}
