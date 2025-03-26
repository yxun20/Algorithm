
import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int s[] = new int [n];
		int cnt=0;
		for(int i=0; i<n; i++)
		{
			s[i] = in.nextInt();
		}
		for(int i1=0; i1<n; i1++)
		{
			int sum=0;
			for(int i2=i1; i2<n; i2++)
			{
				sum = sum + s[i2];
				if(sum==m)
				{
					cnt++;
					break;
				}
				else if(sum>m)
				{
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}