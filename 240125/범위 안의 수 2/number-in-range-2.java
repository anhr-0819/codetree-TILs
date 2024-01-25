import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i<10; i++) {
            int n = scan.nextInt();
            if(n >= 0 && n <= 200) {
                cnt++;
                sum += n;
            }
        }
        System.out.printf("%d %.1f",sum,(double)sum/cnt);
    }
}