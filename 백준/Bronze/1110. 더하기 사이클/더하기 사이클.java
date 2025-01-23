import java.util.Scanner;

import javax.management.QueryExp;
public class Main{
    public static void main(String[] ar){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int x=n;
        int i=0;
        int q=0;
        while(q==0)
        {
            
            int sum1=x/10;
            int sum2=x%10;  
            int sum3=sum1+sum2;
            x=sum2*10+(sum3%10);
            i++;
            if(n==x)
            {
                break;
            }
            
        }
        System.out.println(i);
        
    }
}