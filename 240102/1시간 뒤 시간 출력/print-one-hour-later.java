import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = scan.nextInt();
        int m = scan.nextInt();

        System.out.printf("%d:%d",h+1,m);
    }
}