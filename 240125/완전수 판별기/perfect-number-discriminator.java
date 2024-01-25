import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 1;
        for(int i = 2; i * i < n; i++) {
            if(n%i == 0) {
                sum += i + (int) n/i;
            }
        }
        
        if(sum == n) {
            System.out.print("P");
        } else {
            System.out.print("N");
        }
    }
}