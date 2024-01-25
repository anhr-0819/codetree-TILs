import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = 1;
        while(a<=b) {
            m *= a++;
        }
        System.out.print(m);
    }
}