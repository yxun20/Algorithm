import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int e = in.nextInt();
		int s = in.nextInt();
		int m = in.nextInt();
		int i=1;
		int val=1;
		while(true)
		{
			if((i-e)%15==0 && (i-s)%28==0 && (i-m)%19==0)
			{
				val=i;
				break;
			}
			
			i++;
		}
		System.out.println(val);
	}
}