import java.util.*;
public class DistanceProgram
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Input value or A(x,y) and B(x,y) and C");
        int ax=scr.nextInt();
        int ay=scr.nextInt();
        int bx=scr.nextInt();
        int by=scr.nextInt();
        int cx=scr.nextInt();
        int cy=scr.nextInt();
        
        double solab=Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2));
        double solbc=Math.sqrt(Math.pow((bx-cx),2)+Math.pow((by-cy),2));
        double solac=Math.sqrt(Math.pow((ax-cx),2)+Math.pow((ay-cy),2));
        
        
        if((solab==solbc)&&(solab!=solac||solbc!=solac)||(solbc==solac)&&(solbc!=solab||solac!=solab)||(solab==solac)&&(solab!=solbc||solac!=solbc))
        {
            System.out.println("it is a isosceleces triangle");
            if(Math.pow(solab,2)+Math.pow(solbc,2)==Math.pow(solac,2))
            {
                System.out.println("it is a right angle isosceleces triangle at B");
            }
            if(Math.pow(solac,2)+Math.pow(solbc,2)==Math.pow(solab,2))
            {
                System.out.println("it is a right angle isosceleces triangle at C");
            }
            if(Math.pow(solac,2)+Math.pow(solab,2)==Math.pow(solbc,2))
            {
                System.out.println("it is a right angle isosceleces triangle at A");
            }
            
        }
        else
        {
            System.out.println("it is not a isosceleces triangle");
        }
    }
}