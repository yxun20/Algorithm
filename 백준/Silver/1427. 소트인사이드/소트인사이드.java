import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.*;
import java.io.*;


public class Main{
    
     public static void main(String[] ar)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         
         int length = (int)(Math.log10(n)+1);
         int[] num = new int[length];
         for(int i=length-1; i>=0; i--)
         {
             num[i]=n%10;
             n=n/10;
         }
         

         int[] arr = new int[11]; // 수의 범위 : 0 ~ 10000
 
         for (int i = 0; i < length; i++) 
         {	// 수열의 크기 : n 
             arr[num[i]] ++;
         }
         
         br.close();
         
         StringBuilder sb = new StringBuilder();
         
         // 0은 입력범위에서 없으므로 1부터 시작
         for(int i = 9; i >=0; i--) 
         {
             while(arr[i] > 0) 
             {	// i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
                 sb.append(i);
                 arr[i]--;
             }
         }
         System.out.println(sb);
    }
}