import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner in= new Scanner(System.in);
        double A =in.nextInt();
        double B =in.nextInt();
        
        double C= A/B;
        System.out.println(C);
        in.close();
    }
}