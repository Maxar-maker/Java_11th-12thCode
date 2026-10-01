import java.util.*;
public class Array_Multi
{
    public static void main()
    {
        int A [][]={{1,2,3},{4,5,6},{7,8,9}};//r of A==c of B
        int B [][]={{1,2,3},{4,5,6},{7,8,9}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int a=0;a<3;a++)
                {
                    C[i][j]+=(A[i][a]*B[a][j]);
                }
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