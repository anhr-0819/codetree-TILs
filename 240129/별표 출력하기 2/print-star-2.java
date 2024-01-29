import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = n; i>0; i--) {
            for(int j = i; j>0; j--) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}