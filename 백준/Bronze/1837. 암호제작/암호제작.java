import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    public static boolean[] check = new boolean[1000001];
    public static String P;
    public static int K;
    public static int size;
    public static char[] P_char;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        // 소수 계산
        for (int x = 2; x <= 1000000; x++) {

            if(check[x])
                continue;

            for (int y = 2 * x; y <= 1000000; y += x) {

                check[y] = true;
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        P = st.nextToken();
        K = Integer.parseInt(st.nextToken());

        size = P.length();
        P_char = P.toCharArray();

        int ans = find();

        if (ans == -1) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + ans);
        }
    }

    public static int find() {

        int ans = -1;

        for (int x = 2; x < K; x++) {
            if (!check[x] && divide(x)) {
                ans = x;
                return ans;
            }
        }

        return ans;
    }

    public static boolean divide(int x) {

        int mid = 0;

        for (int idx = 0; idx < size; idx++) {
            mid = mid * 10 + P_char[idx] - '0';

            mid %= x;
        }

        return mid == 0;
    }




}