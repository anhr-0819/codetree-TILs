import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cnt = 0;
        int sum = 0;
        while(a<=b) {
            if(a%5 == 0 || a%7 == 0) {
                cnt++;
                sum += a;
            }
            a++;
        }
        System.out.printf("%d %.1f",sum,(double) sum / cnt);
    }
}