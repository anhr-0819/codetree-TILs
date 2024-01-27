import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int w = scan.nextInt();
            int h = scan.nextInt();
            String s = scan.next();
            System.out.println(w*h);
            if(s.equals("C")) break;
        }
    }
}