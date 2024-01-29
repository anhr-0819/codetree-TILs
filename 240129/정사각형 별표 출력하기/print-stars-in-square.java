import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}