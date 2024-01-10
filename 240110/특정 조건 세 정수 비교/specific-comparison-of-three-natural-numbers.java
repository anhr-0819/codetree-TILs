import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int min = a;
        int b = scan.nextInt();
        min = min<= b ? min : b;
        int c = scan.nextInt();
        min = min<= c ? min : c;
        
        if(a === min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if(a == b && b == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}