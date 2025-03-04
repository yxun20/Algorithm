
import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i=0;
		while(n!=0)
		{
			int k=1;
			while(k<=n)
			{
				n=n-k;
				k++;
				i++;
			}
		}
		System.out.println(i);
	}

}