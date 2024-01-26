import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int cnt = 0;
        while(n-->=1) {
            if(n%2 == 0 || n%3 == 0 || n%5 == 0) {
                continue;
            } 
            cnt++;
        }
        System.out.print(cnt);
    }
}