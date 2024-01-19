import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a<=0) {
            System.out.print(0);
        } else {
            while(1<=b) {
                System.out.print(a);
                b--;
            }
        }
    }
}