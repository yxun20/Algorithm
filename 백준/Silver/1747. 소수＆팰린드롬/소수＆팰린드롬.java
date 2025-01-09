import java.util.*;

public class Main {

	public static void main(String[] ar) {
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		
		boolean[]ch=new boolean[1003001+1];
        ch[0] = ch[1]=true;
        for(int i1=2; i1*i1<=1003001; i1++)
        {
            if(!ch[i1])
            {
                for(int i2=i1*i1; i2<=1003001; i2+=i1) ch[i2] = true;
            }
        }
        
		for(int i1=n; i1<=1003001; i1++)
		{
			if(!ch[i1])
			{
				String s= Integer.toString(i1);
				int y=s.length();
				char c[] = new char [y];
				for(int i2=0; i2<y; i2++)
				{
					c[i2]=s.charAt(i2);
				}
				int cnt=0;
				for(int i3=0; i3<=(y-1)/2; i3++)
				{
					if(c[i3]!=c[(y-1)-i3])
					{
						cnt++;
					}
					/*char tmp=c[i3];
					c[i3]=c[y-1];
					c[y-1]=c[i3];*/
				}
				/*int ccnt=0;
				char cc[] =new char[y];
				for(int i3=0; i3<y; i3++)
				{
					cc[i3]=s.charAt(i3);
					if(c[i3]==cc[i3])
					{
						ccnt++;
					}
				}
				if(ccnt==(y-1))
				{
					System.out.println(i1);
					return;
				}*/
				if(cnt==0)
				{
					System.out.println(i1);
					return;
				}
			}
		}
 
	}
}