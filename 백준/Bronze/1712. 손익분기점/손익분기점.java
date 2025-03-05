import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int a= in.nextInt();
         int b= in.nextInt();
         int c= in.nextInt();
         if(c<=b)
         {
             System.out.println("-1");
         }
         else
         {
             System.out.println((a/(c-b))+1);
         }
         
     }
}
