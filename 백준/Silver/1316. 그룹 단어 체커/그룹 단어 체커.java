import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int incount = in.nextInt();
         int []cnt=new int [incount];
         for(int i6=0; i6<incount; i6++)
         {
             cnt[i6]=0;
         }
         for(int i1=0; i1<incount; i1++)
         {
             String input = in.next();
             char []i_c = input.toCharArray();
             int i_len = input.length();
             int [] alpa= new int[26];
             for(int i4=0; i4<26; i4++)
             {
                 alpa[i4]=0;
             }
             for(int i2=0; i2<i_len; i2++)
             {
                 if(i2==i_len-1)
                 {
                     break;
                 }
                 for(int i3=0; i3<26; i3++)
                 {
                     if(97+i3 == i_c[i2])
                     {
                         alpa[i3]++;
                     }
                 }
                 if(i_c[i2]!=i_c[i2+1])
                 {
                     for(int i3=0; i3<26; i3++)
                     {
                         if(97+i3 == i_c[i2+1])
                         {
                             if(alpa[i3]>0)
                             {
                                 cnt[i1]++;
                             }
                         }
                     }
                 }
             }
         }
         int output=0;
         for(int i7=0;i7<incount; i7++)
         {
             if(cnt[i7]==0)
             {
                 output++;
             }
         }
         System.out.println(output);
    }
} 