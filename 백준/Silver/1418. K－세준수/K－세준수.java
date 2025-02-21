import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);
        int N= in.nextInt();
        int K= in.nextInt();
        int cnt=1;
        for(int i=2; i<=N; i++)
        {
        	int max=0;
        	int n=i;
    
        	while(n!=1)
            {
                for(int i1=2; i1<=n; i1++)
                {
                    if(n%i1==0)
                    {
                        n=n/i1;
                        if(i1>max)
                        {
                        	max=i1;
                        }
                        break;
                     
                    }
                }
            }
        	if(max<=K)
        	{
        		cnt++;
        	}
        }
        System.out.println(cnt);
	}
}