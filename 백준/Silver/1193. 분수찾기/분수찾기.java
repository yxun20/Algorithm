import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int input = in.nextInt();
         int cnt=0;
         int i1=2;
         int result_x=0,result_y=0;
         while (cnt<input)
         {
             if(i1%2==1)
             {
                 int x=1;
                 int y=i1-x;
                 for(y=i1-x; y>=1; y-- )
                 {
                     result_x= x; //1 1
                     result_y= y; //1 2
                     x++;
                     cnt++;
                     if(cnt==input)
                     {
                         break;
                     }
                 }
             }
             else if(i1%2==0)
             {
                 int y=1;
                 int x=i1-y;
                 for(x=i1-y; x>=1; x--)
                 {
                     result_x= x; //1 1
                     result_y= y; //1 2
                     y++;
                     cnt++;
                     if(cnt==input)
                     {
                         break;
                     }
                 }
             }
             i1++;
         }
         System.out.println(result_x+"/"+result_y);
    }
} 