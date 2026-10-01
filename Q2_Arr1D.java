import java.util.*;
public class Q2_Arr1D
{
    
    public static void main(int n)
    {
        int arr[]=new int[n];
        int arr1[]=new int [n];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        
        int mid = n / 2;
        arr1[mid] = arr[0];

        int left = mid - 1;
        int right = mid + 1;
        int k = 1;

        while (k < n) {
        if (right < n)
        arr1[right++] = arr[k++];

        if (k < n && left >= 0)
        arr1[left--] = arr[k++];
    }   
        for(int a: arr1)
        {
            System.out.println(a);
        }
    }
}
