import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n*2; i++) {
            int k = i>n ? n-(i-n) : i;
            for(int j = 0; j<k; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}