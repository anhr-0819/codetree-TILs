import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<(n-i)*2; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<i*2-1; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}