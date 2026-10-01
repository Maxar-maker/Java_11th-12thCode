import java.util.*;
class Palinprime{
    Scanner in=new Scanner(System.in);
    String line;
    Palinprime(){
        line="";
    }
    void input(){
        System.out.println("Enter a sentence.");
        line=in.nextLine();
        in.close();
    }
    boolean checkprime(String n){
        int len=n.length();
        if(len==1)
        return false;
        int c=2;
        boolean flag = false;
        while(c<len){
            if(len%c==0)
            flag=false;
            else
            {
                flag = true;
                c++;
            }
        }
        if(flag) return true;
        else return false;
    }
    boolean palincheck(String n){
        //char arr[] = n.toCharArray();
        int len=n.length();
        String temp="";
        for(int i=len-1;i>=0;i--){
            temp+=n.charAt(i);
        }
        if(temp.equals(n)==true)
        return true;
        else
        return false;
    }
    void display(){
        //String[] arr = line.split("[ .]");
        int l=line.length();
        String word="";
        for(int i=0;i<l;i++){
            if((line.charAt(i)==' ')||(line.charAt(i)=='.')){
                if((palincheck(word)==true)&&(checkprime(word)==true))
                System.out.println(word+" ");
                 word="";
            }
            else
            word+=line.charAt(i);
        }
    }
    public static void main(){
        Palinprime obj=new Palinprime();
        obj.input();
        obj.display();
    }
}