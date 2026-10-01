import java.util.*;
public class Recycle_2025_SP
{
    int cap;
    int front=0;
    int rear;
    int ele[];
    public Recycle_2025_SP(int arr[],int max)
    {
        ele=arr;
        rear=0;
        cap=max;
    }
    public void pushfront(int v)
     { if(front !=0)
         ele[front--]=v;
         else
         System.out.println("FULL FROM FRONT");
     }
    public int poprear()
    { if(front !=rear)
         return(ele[rear--]);
         else
         return -999;
    }
    public static void main(int arr[],int max)
    {
        Recycle_2025_SP ob=new Recycle_2025_SP(arr, max);
    }
}