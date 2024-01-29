import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i = 1; ; i++) {
            if((int)Math.pow(2,i) == n) {
                System.out.print(i);
                break;
            }
        }
    }
}