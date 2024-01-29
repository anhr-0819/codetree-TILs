import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char c = 'N';
        for(int i = 2; i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                c = 'C';
                break;
            }
        }
        System.out.print(c);
    }
}