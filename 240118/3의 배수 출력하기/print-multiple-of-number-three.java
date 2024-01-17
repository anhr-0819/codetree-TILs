import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 3;
        while(result<=n) {
            System.out.print(result + " ");
            result += 3;
        }
    }
}