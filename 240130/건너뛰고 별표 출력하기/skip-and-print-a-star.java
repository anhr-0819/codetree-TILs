import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        // 
        int cnt = 1;
        while(cnt != 0) {
            for(int i = 0; i<cnt; i++) {
                sb.append("*");
            }
            cnt = cnt>n*2 ? --cnt : ++cnt;
            sb.append("\n");
        }
        System.out.print(sb);
    }
}