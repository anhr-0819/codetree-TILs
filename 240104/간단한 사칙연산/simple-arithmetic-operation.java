import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d\n%d\n%d\n%d",a+b,a-b,a/b,a%b);
    }
}