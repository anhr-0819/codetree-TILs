import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        for(int i = 0; i<n; i++) {
            System.out.println(a+=n);
        }
    }
}