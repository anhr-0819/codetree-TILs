import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<i*2; j++) {
                System.out.print(" ");
            }
            for(int k = i; k<(2 * n) - 1 - i;k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}