import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int [] s = new int[4];
         s[0]= in.nextInt();
         s[1]= in.nextInt();
         s[2]= in.nextInt()-s[0];
         s[3]= in.nextInt()-s[1];
         int sum=10000;
         
         for(int i=0; i<4; i++)
         {
             if(s[i]<=sum)
             {
                 sum=s[i];
             }
         }
         System.out.println(sum);
    }
} 