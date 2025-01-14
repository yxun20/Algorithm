import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Main{
    static char input[][];
    public static void main(String[] ar)
    {
        Scanner in= new Scanner(System.in);
        int n =in.nextInt(); //줄
        int m =in.nextInt(); //줄안 갯수
        input = new char[n][m];
        //int [][] cnt = new int [n-7][m-7];
        in.nextLine();
        int king=0;
        for(int i1=0; i1<n; i1++)
        {
            String s =in.nextLine();
            for(int i2=0; i2<m; i2++)
            {
                input[i1][i2] = s.charAt(i2);
            }
            
        }
        
        int ans =1000000;
        for(int i1=0;i1<n-7; i1++)
        {
            
            for(int i2=0; i2<m-7; i2++)
            {
                ans = Math.min(ans,f(i1,i2));
                //cnt[i1][i2]=0;
                /*for(int i3=i1; i3<i1+8; i3++)
                {
                    
                    for(int i4=i2; i4<i2+8; i4++)
                    {
                        System.out.println(cnt[i1][i2]);
                        if( ((i3-i1)%2==1&&(i4-i2)%2==0) || ((i3-i1)%2==0&&(i4-i2)%2==1) ) //b가 나오는
                        {          
                            System.out.println(cnt[i1][i2]);
                            if(input[i1][i2]==input[i3][i4])
                            {
                                cnt[i1][i2]++;
                                System.out.println(cnt[i1][i2]);
                            }
                        
                        }//달라야 맞는 경우=같으면 +1
                        else if( ((i3-i1)%2==1&&(i4-i2)%2==1) || ((i3-i1)%2==0&&(i4-i2)%2==0) ) //w
                        {
                            System.out.println(cnt[i1][i2]);
                            if(input[i1][i2]!=input[i3][i4]) //w인데 다르면
                            {
                                cnt[i1][i2]++;
                                System.out.println(cnt[i1][i2]);
                            }
                        } //같아야 맞는 경우= 다르면 +1
                    }
                }*/
            }
        }
        System.out.println(ans);
        
        /*for(int i1=0; i1<n-7; i1++)
        {
            for(int i2=0; i2<m-7; i2++)
            {
                if(king<cnt[i1][i2])
                {
                    king=cnt[i1][i2];
                    
                }
            }
        }
        
        System.out.println(king);*/
    }
    
    public static int f(int x, int y)
    {
        int b=0;
        int w=0;
        for(int i3=x; i3<x+8; i3++)
                {
                    
                    for(int i4=y; i4<y+8; i4++)
                    {
                        if( (i3+i4)%2==0 ) //b가 나오는
                        {          
                            if(input[i3][i4]=='B')
                            {
                                w++;
                            }
                            else b++;
                        
                        }//달라야 맞는 경우=같으면 +1
                        else  //w
                        {

                            if(input[i3][i4]=='W') //w인데 다르면
                            {
                                w++;
                            }
                            else b++;
                        } //같아야 맞는 경우= 다르면 +1
                    }
                }
        return Math.min(b,w);
    }
} 