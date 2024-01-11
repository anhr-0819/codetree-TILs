import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int f = scan.nextInt();
        if(m>=90 && f>=90) {
            if(f>=95) {
                System.out.print(100000);
            } else {
                System.out.print(50000);
            }
        } else {
            System.out.print(0);
        }
    }
}