import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int num=0;
        int sum=0;
        int cnt=0;
        int min=0;
        for(int i=1; i<=100; i++)
        {
        	num=i*i;
        	if(x<=num&&num<=y)
        	{
        		sum=sum+num;
        		cnt++;
        		if(cnt<2)
        		{
        			min=num;
        		}
        		
        	}
        }
        if(cnt==0)
        {
        	System.out.println("-1");
        }
        else
        {
        	System.out.println(sum);
        	System.out.println(min);
        }
	}

}