import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int kim = in.nextInt();
		int lim = in.nextInt();
		int cnt=0;
		while(kim!=lim)
		{
			kim=kim/2+kim%2;
			lim=lim/2+lim%2;
			cnt++;
		}
		System.out.println(cnt);
	}
}