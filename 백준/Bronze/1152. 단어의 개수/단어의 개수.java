import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.StringTokenizer;

public class Main{

     public static void main(String[] ar){
         Scanner in= new Scanner(System.in);
         String s= in.nextLine();
         StringTokenizer st = new StringTokenizer(s," ");
		
		
         System.out.println(st.countTokens());
    }
} 