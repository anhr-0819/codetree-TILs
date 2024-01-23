import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++) {
            int input = scan.nextInt();
            if(input%2 != 0 && input%3 == 0) {
                sb.append(input).append("\n");
            }
        }
        scan.close();
        System.out.print(sb);
    }
}