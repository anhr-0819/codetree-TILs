import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int a = scan.nextInt();
        max = Math.max(max,a);
        int b = scan.nextInt();
        max = Math.max(max,b);
        int c = scan.nextInt();
        max = Math.max(max,c);

        System.out.print(max);
    }
}