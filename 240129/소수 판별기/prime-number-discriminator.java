import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char result = 'P';
        for(int i = 2; i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                result = 'C';
                break;
            }
        }
        System.out.print(result);
    }
}