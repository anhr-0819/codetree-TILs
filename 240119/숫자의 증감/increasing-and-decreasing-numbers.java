import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        int n = scan.nextInt();
        if(c.equals("A")) {
            for(int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else {
            for(int i = n; 1 <= i; i--) {
                System.out.print(i + " ");
            }
        }
    }
}