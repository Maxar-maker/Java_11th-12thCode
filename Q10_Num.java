import java.util.*;
public class Q10_Num
{
    public static void main(String str)
    {
        String arr[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        int num = 0;
        int power = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].charAt(0) == ch) {
                    num += j * Math.pow(16, power);
                    break;
                }
            }
            power++;
        }

        System.out.println("Decimal Value: " + num);
    }
}