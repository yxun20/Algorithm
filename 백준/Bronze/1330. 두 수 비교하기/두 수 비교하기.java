import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner in= new Scanner(System.in);
        int A =in.nextInt();
        int B =in.nextInt();
        if (A>B)
        {
            System.out.println(">");
        }
        else if(A<B)
        {
            System.out.println("<");
        }
        else if(A==B){
            System.out.println("==");
        }
    }
}