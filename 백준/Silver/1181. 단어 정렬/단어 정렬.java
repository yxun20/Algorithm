import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.*;
import java.io.*;


public class Main{
    
     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         int n = in.nextInt();
         String [] a = new String [n];
         
         in.nextLine();
         
         for(int i1=0; i1<n; i1++)
         {
             a[i1]=in.nextLine();
         }
         
         Arrays.sort(a, new Comparator<String>() {
             public int compare(String e1, String e2) 
             {
                 if(e1.length() == e2.length()) 
                 {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
                     return e1.compareTo(e2);
                 }
                 else 
                 {
                     return e1.length() - e2.length();
                 }
             }
         });
         
         System.out.println(a[0]);
         for(int i1=1; i1<n; i1++)
         {
             if (!a[i1].equals(a[i1 - 1])) 
             {
                 System.out.println(a[i1]);
             }
         }
    }
    
}
         