

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char arr[][] = new char [n][m];
		for(int i1=0; i1<n; i1++)
		{
			String s = in.next();
			for(int i2=0; i2<m; i2++)
			{
				arr[i1][i2]=s.charAt(i2);
			}
		}
		
		
		int size=0;
		if(n<=m)
		{
			size=n;
		}
		else
		{
			size=m;
		}
		
		long output=0;
		for(int i1=0; i1<size; i1++)
		{
			for(int i2=0; i2<(n-i1); i2++)
			{
				//System.out.println(1);
				for(int i3=0; i3<(m-i1); i3++)
				{
					//System.out.println(1);
					char q1=arr[i2][i3]; //왼상
					char q2=arr[i2][i3+i1]; //우상
					char q3=arr[i2+i1][i3]; //왼하
					char q4=arr[i2+i1][i3+i1]; //우하
					//System.out.println(1);
					//System.out.println(q1+" "+q2+" "+q3+" "+q4+" "+(i1+1));
					if(q1==q2&&q2==q3&&q3==q4)
					{
						//System.out.println(q1+" "+q2+" "+q3+" "+q4+ i1);
						output=(i1+1)*(i1+1);
						//System.out.println(output);
					}
				}
			}
		}
		System.out.println(output);
	}
}
