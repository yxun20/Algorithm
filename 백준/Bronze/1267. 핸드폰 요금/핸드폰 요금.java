import java.util.Scanner;
 
public class Main {
 
    public static int Y(int time, int money) {
        while (true) {
            if (time < 30) {
                money += 10;
                break;
            } else if (30 <= time && time < 60) {
                money += 20;
                break;
            } else if (time >= 60) {
                money += 20;
                time -= 60;
            }
        }
        return money;
    }
 
    public static int M(int time, int money) {
        while (true) {
            if (time < 60) {
                money += 15;
                break;
            } else if (60 <= time && time < 120) {
                money += 30;
                break;
            } else if (time >= 120) {
                money += 30;
                time -= 120;
            }
        }
        return money;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int num = sc.nextInt();
        int sumY = 0;
        int sumM = 0;
 
        for (int i = 0; i < num; i++) {
            int money = 0;
            int time = sc.nextInt();
            sumY += Y(time, money);
            sumM += M(time, money);
 
        }
 
        if (sumM == sumY) {
            System.out.println("Y M " + sumM);
        } else if (sumM > sumY) {
            System.out.println("Y " + sumY);
        } else if (sumM < sumY) {
 
            System.out.println("M " + sumM);
        }
 
    }
 
}