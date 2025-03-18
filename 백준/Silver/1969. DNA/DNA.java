import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char s[][] = new char [n][m];
		int cnt=0;
		char t[] = new char [m];
		int cnts[] = new int [4];
		for(int i=0; i<n; i++)
		{
			String str =in.next();
			for(int i1=0; i1<m; i1++)
			{
				s[i][i1]=str.charAt(i1);
			}
		}
		for(int i2=0; i2<m; i2++)
		{
			int max=0;
			for(int i=0; i<4; i++)
			{
				cnts[i]=0;
			}
			for(int i1=0; i1<n; i1++)
			{
				if(s[i1][i2]==65) //A
				{
					cnts[0]++;
				}
				else if(s[i1][i2]==67) //C
				{
					cnts[1]++;
				}
				else if(s[i1][i2]==71) //G
				{
					cnts[2]++;
				}
				else if(s[i1][i2]==84) //T
				{
					cnts[3]++;
				}
			}
			for(int i=0; i<4; i++)
			{
				if(max<cnts[i])
				{
					max=cnts[i];
					if(i==0)
					{
						t[i2]='A';
					}
					else if(i==1)
					{
						t[i2]='C';
					}
					else if(i==2)
					{
						t[i2]='G';
					}
					else if(i==3)
					{
						t[i2]='T';
					}
				}
			}
			int ccnt=0;
			for(int q=0; q<4; q++)
			{
				if(max>cnts[q])
				{
					cnt=cnt+cnts[q];
				}
				else
				{
					ccnt=ccnt+cnts[q];
				}
			}
			if(ccnt>max)
			{
				cnt=cnt+ccnt-max;
			}
		}
		for(int i=0; i<m; i++)
		{
			System.out.print(t[i]);
		}
		System.out.println();
		System.out.println(cnt); 
	}
}
