import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.nextLine().charAt(0);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.printf("%c\n%.2f\n%.2f",c,a,b);
    }
}