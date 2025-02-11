import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{

     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         while(true)
         {
             String x= in.next();
             if(Integer.parseInt(x)==0)
             {
                 break;
             }
             int len= x.length();
             char []sc = x.toCharArray();
             int cnt=0;
             for(int i1=0; i1<len/2; i1++)
             {
                  if(sc[i1]!=sc[len-1-i1])
                     {
                         cnt++;
                     }   
             }
             if(cnt!=0)
             {
                 System.out.println("no");
             }
             else if(cnt==0)
             {
                 System.out.println("yes");
             }
             
         }
    }
} 