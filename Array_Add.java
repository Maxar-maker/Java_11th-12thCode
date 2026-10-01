import java.util.*;
public class Array_Add
{
    public static void main()
    {
        int A [][]={{1,2,3},{4,5,6},{7,8,9}};
        int B [][]={{1,2,3},{4,5,6},{7,8,9}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[j][i]+B[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(C[i][j]+"    " );
            }
            System.out.println();
        }
    }
}