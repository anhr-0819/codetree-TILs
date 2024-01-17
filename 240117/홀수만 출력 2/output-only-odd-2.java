import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a = scan.nextInt();
        while(a<=b) {
            System.out.print(b + " ");
            b -= 2;
        }
    }
}