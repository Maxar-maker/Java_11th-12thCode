import java.util.*;
public class Q8_Num
{
    static int N, digits, tempPrime=0, dupN=N;//Declaring static variables for use in program
    void accept()//Declaring method 'accept()' to take user input
    {
        Scanner in=new Scanner(System.in);//Declaring 'Scanner' class to take user input
        System.out.print("N = ");//Asking user to input a number 'N'
        N=in.nextInt();
        int dupn=N, temp=0;//Declaring local variables for use
        while (dupn>0)//Initialising 'while' loop to find number of digits in 'dupn'
        {
            temp=dupn%10;
            digits++;
            dupn=dupn/10;
        }
    }
    boolean prime(int n)//Declaring method 'prime(int n)' to check if a number is prime
    {
        boolean temp=false;//Declaring local variable 'temp'
        for (int i=2;i<(n/2);i++)//Initialising 'for' loop to check if Prime
        {
            if (n%i==0)//Checking if divisible by other numbers
            {
                temp=false;//Equating 'temp' to 'false'
            }
            else//When not divisible by other numbers
            {
                tempPrime+=1;//Incrementing tempPrime since 'n' is prime
                temp=true;//Equating 'temp' to 'true'
            }
        }
        if (temp==false)//Checking if 'temp' is 'false'
        return false;
        else//Checking if 'temp' is 'true'
        return true;
    }
    void CPrime()//Declaring method 'CPrime' to print output
    {
        boolean flag=false;//Declaring 'flag'
        int last, lm;//Declaring local variables
        for (int i=1;i<=digits;i++)//To perform circular shift
        {
            System.out.println(N);//Printing 'N'
            if (prime(N))//Checking if prime
            flag=true;
            else
            flag=false;
            lm=N/(int)(Math.pow(10, digits-1));//Finding left most digit
            last=N%(int)(Math.pow(10, digits-1));//Finding last digit
            N=(last*10)+lm;//Finding circular shift
        }
        if (flag==true)//Checking if 'tempPrime' equals 'digits', i.e., if number of prime circular shift numbers equals digits
        {
            System.out.println("Circular Prime");//Printing that 'dupN' is a Circular Prime
        }
        else//If 'tempPrime' does not equal 'digits', i.e., if number of prime circular shit numbers does not equal digits
        {
            System.out.println("Not a Circular Prime");//Printing that 'dupN' is not a Circular Prime
        }
    }
    public static void main()//Declaring 'main()' method
    {
        Q8_Num ob=new Q8_Num();//Declaring constructor
        ob.accept();//Calling 'accept()'
        ob.prime(N);//Calling 'prime(N)'
        ob.CPrime();//Calling 'CPrime()'
    }
}