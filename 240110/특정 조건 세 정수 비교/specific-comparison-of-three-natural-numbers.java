import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a<=b) {
            if(b<=c) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        } else {
            System.out.print(0 + " ");
        }
        if(a == b && b == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
            }
    }
}