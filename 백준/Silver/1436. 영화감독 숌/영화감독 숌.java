import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{

     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int n = in.nextInt();
         int i2=666;
         int sum=0, num=0, cnt=0, cnt2=0;
         for(int i1=0; i1<n; i1++)
         {
             while(true)
             {
                 sum=i2;
                 cnt=0;
                 while(sum!=0)
                 {
                     num=sum%10;
                     sum=sum/10;
                     if(num==6)
                     {
                         cnt++;
                     }
                     else if(num!=6 &&cnt<3)
                     {
                         cnt=0;
                     }
                 }
                 i2++;
                 if(cnt>=3)
                 {
                     break;
                 }
             }
         }
         System.out.println(i2-1);
    }
} 