import java.util.*;
public class Connect4
{
    public static void main()
    {
        int[][] arr={{0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}};
        int p1=1;
        int p2=2;
        Scanner scr=new Scanner(System.in);
        int r=0;
        int c=0;
        int count=1;
        int dr=0;
        int dc=0;
        if(count%2==0)
            {
            r=scr.nextInt();
            c=scr.nextInt();
            arr[r][c]=p1;
            dr=r;
            dc=c;
            count++;
            }
            else
            {
               r=scr.nextInt();
               c=scr.nextInt();
               arr[r-1][c-1]=p2;
               count++;
            } 
        while(true)
        {
           if(count%2==0)
            {
            r=scr.nextInt();
            c=scr.nextInt();
            arr[r][c]=p1;
            count++;
            }
            else
            {
               r=scr.nextInt();
               c=scr.nextInt();
               arr[r-1][c-1]=p2;
               count++;
            } 
            if((arr[dr][dc]==1&&arr[dr+1][dc+1]==1&&arr[dr+1][dc+1]==1&&arr[dr+1][dc+1]==1)||
            arr[dr][dc]==2&&arr[dr+1][dc+1]==2&&arr[dr+1][dc+1]==2&&arr[dr+1][dc+1]==2)
            {
                
            }
        }
        for(int i=0)
        
        
    }
}