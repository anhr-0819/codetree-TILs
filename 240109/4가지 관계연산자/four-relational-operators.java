import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>=b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a>b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(b>=a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(b>a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
    }
}