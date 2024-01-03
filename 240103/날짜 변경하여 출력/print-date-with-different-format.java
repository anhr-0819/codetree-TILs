import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\.");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        System.out.printf("%d-%d-%d", m, d, y);
    }
}