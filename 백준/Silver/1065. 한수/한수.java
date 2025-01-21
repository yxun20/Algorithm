import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;


public class Main{
    public static int d(int n) 
    {
        int cnt=99;
        int num1=0,num2=0,num3=0,num4=0;
        int val1,val2;
        for(int i=100; i<=n;i++)
        {
            num1=i/100;
            num2=i%100/10;
            num3=i%10;
            val1=num1-num2;
            val2=num2-num3;
            if(val1==val2)
            {
                cnt=cnt+1;
            }
        }
        return cnt;
    }
   

     public static void main(String[] ar){
        //Scanner in= new Scanner(System.in);
        //int a =in.nextInt();
        //double[][] s = new double[a][];
         Scanner in= new Scanner(System.in);
         int n =in.nextInt();
         int result=0;
         if(n<100)
         {
             result=n;
         }
         else if(100<=n)
         {
             result=d(n);
         }
         System.out.println(result);
    }
} 