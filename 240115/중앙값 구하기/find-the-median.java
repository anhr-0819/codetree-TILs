import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max , min;
        int a = scan.nextInt();
        max = min = a;
        int b = scan.nextInt();
        max = Math.max(max,b);
        min = Math.min(min,b);
        int c = scan.nextInt();
        max = Math.max(max,c);
        min = Math.min(min,c);

        if(a == max || a == min) {
            if(b == max || b == min) {
                System.out.print(c);
            } else {
                System.out.print(b);
            }
        } else {
            System.out.print(a);
        }
    }
}