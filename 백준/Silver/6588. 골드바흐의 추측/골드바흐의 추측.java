import java.util.*;

public class Main {
	public static final int MAX = 1000000;

	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);

		boolean[] num = new boolean[MAX+1];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= MAX; j += i) {
                    num[j] = true;
                }
            }
        }
        
        while(true)
        {
        	int n = in.nextInt();
        	boolean ok = false;
        	if(n==0)
        	{
        		break ;
        	}
        	for(int i=1; i<=n/2; i+=2)
			{
        		
        			if(!num[i] && !num[n-i])
    				{
 
    					System.out.println(n+" = "+i+" + "+ (n-i));
    					ok = true;
    					break;
    				}
        		
			}
        	if(!ok)
        	{
        		System.out.println("Goldbach's conjecture is wrong.");
        	}
        }

	}
}