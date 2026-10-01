import java.util.*;

public class TicTacToe
{   
    char[][] grid = new char[3][3];
    TicTacToe(char init)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                grid[i][j] = init;
            }
        }
    }
    void printgrid()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    void enterVal(char ch, int pos)
    {
        pos %= 10;
        int p = pos-1;
        int r = p/3;
        int c = p-(r*3);
        grid[r][c] = ch;
    }
    public static void main()
    {
        TicTacToe ttt = new TicTacToe('-');
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            for(int i = 0; i < 9; i++)
            {
                ttt.printgrid();
                ttt.enterVal('X', sc.nextInt());
                ttt.printgrid();
                ttt.enterVal('O', sc.nextInt());
            }
            ttt = new TicTacToe('-');
        }
    }
}
