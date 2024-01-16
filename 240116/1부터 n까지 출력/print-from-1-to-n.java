import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append(" ");
        }   
        System.out.print(sb);
    }
}