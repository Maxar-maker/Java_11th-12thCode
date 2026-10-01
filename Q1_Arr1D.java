import java.util.*;
public class Q1_Arr1D
{
    
    public static void main(int n)
    {
        int arr[]=new int[n];
        int arr1[]=new int [n];
        int arr_m[]=new int[n+n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr_m[i]=arr[i];
        }
        int cc=0;
        for(int i=n;i<2*n;i++)
        {
            arr_m[i]=arr1[cc];
            cc++;
        }
        for (int i = 0; i < arr_m.length-1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr_m.length; j++) {
                if (arr_m[j] < arr_m[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the current element
            int temp = arr_m[minIdx];
            arr_m[minIdx] = arr_m[i];
            arr_m[i] = temp;
        }
        for(int a: arr_m)
        {
            System.out.println(a);
        }
    }
}
