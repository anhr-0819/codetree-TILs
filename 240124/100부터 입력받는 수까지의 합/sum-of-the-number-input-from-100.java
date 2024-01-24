import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        while(n<=100) {
            sum += n;
            n++;
        }
        System.out.print(sum);
    }
}