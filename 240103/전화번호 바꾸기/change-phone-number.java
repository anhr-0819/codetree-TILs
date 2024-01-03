import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("-");
        String s = scan.next();
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        System.out.printf("%s-%d-%d", s, y, x);
    }
}