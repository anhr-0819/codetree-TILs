import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++) {
            if(i%2 != 0 && !(i%3 == 0 && i%9 != 0) && i%10 != 5) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}