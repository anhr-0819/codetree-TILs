import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int b = scan.nextInt();
        max = Math.max(max,b);
        int c = scan.nextInt();
        max = Math.max(max,c);

        System.out.print(max);
    }
}