import java.util.*;
public class Q4_Arr2D
{
    public static void main(int n)
    {
        int arr[][]=new int[n][n];
        arr[0][0]=9999;
        arr[n/2][n/2]=1;
        int b=n/2;
        int cc=2;
        int r=1;
        int c=1;
        int i=1;
        while(arr[0][0]==9999)
        {
            if(i%2==0)
            {
                c=b+i;
                r=b-i;
                arr[b][c]=cc;
                System.out.println(arr[b][c]);
                cc++;
                arr[r][b]=cc;
                System.out.println(arr[r][b]);
                cc++;
                
            }
            else
            {
                c=b-i;
                r=b+i;
                arr[b][c]=cc;
                System.out.println(arr[b][b-i]);
                cc++;
                arr[r][b]=cc;
                System.out.println(arr[b-i][b]);
                cc++;
            }
            i++;
        }
        for(int a=0;a<n;a++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[a][b]);
            }
        }
    }
}
