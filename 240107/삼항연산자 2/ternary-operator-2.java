import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char c = a == 1 ? 't' : 'f';
        System.out.print(c);
    }
}