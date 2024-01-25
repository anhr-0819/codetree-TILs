import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int n = 1, m = 1;
        while(n<=b) {
            if(n%a == 0) {
                m *= n;
                n += a;
            } else {
                n++;
            }
        }
        System.out.print(m);
    }
}