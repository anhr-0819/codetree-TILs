import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int cnt = n;
        while(n>=1) {
            if(n%2 == 0 || n%3 == 0 || n%5 == 0) {
                cnt--;
            } 
            n--;
        }
        System.out.print(cnt);
    }
}