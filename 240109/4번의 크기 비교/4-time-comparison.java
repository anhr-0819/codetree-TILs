import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        if(a>b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a>c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a>d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a>e) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}