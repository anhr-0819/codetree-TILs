import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int m = 1;
        for(int i = 1; i<=10; i++) {
            m *= i;
            if(m>=n) {
                System.out.print(i);
                break;
            }
        }
    }
}