import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i>0; i--) {
           for(int j = 0; j<n; j++) {
            for(int k = 0; k<n; k++) {
                sb.append("*");
            }
            sb.append("\n"); 
           }
           sb.append("\n"); 
        }
        System.out.print(sb);
    }
}