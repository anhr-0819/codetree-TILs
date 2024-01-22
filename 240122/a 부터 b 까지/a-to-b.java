import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while(a<=b) {
            System.out.print(a + " ");
            if(a%2 == 0) {
                a += 3;
            } else {
                a *= 2;
            }
        }
    }
}