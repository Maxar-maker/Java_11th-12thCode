import java.util.*;

public class Q5_Arr2D{
    int arr[][];
    int i = 1;
    int cc = 1;
    int sc;
    int sr;
    int er;
    int ec;
    int total;

    public Q5_Arr2D(int r, int c) {
        arr = new int[r][c];
        sc = c / 2;
        sr = r / 2;
        arr[sr][sc] = cc;
        er = r;
        ec = c;
        total = r * c;
    }

    public void left() {
        // move left
        for (int k = 0; k < i && cc < total; k++) {
            sc--;
            if (isValid(sr, sc))
                arr[sr][sc] = ++cc;
        }

        // move down
        for (int k = 0; k < i && cc < total; k++) {
            sr++;
            if (isValid(sr, sc))
                arr[sr][sc] = ++cc;
        }

        i++;
    }

    public void right() {
        // move right
        for (int k = 0; k < i && cc < total; k++) {
            sc++;
            if (isValid(sr, sc))
                arr[sr][sc] = ++cc;
        }

        // move up
        for (int k = 0; k < i && cc < total; k++) {
            sr--;
            if (isValid(sr, sc))
                arr[sr][sc] = ++cc;
        }

        i++;
    }

    public void arr() {
        while (cc < total) {
            left();
            right();
        }
    }

    private boolean isValid(int r, int c) {
        return r >= 0 && r < er && c >= 0 && c < ec;
    }

    public static void main(int n,int m) {
        Q5_Arr2D ob = new Q5_Arr2D(n, m);
        ob.arr();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ob.arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}