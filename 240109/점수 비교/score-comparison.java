import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();

        if(a1>b1 && a2>b2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}