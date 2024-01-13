import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();

        if(y%4 == 0) {
            if(y%100 == 0) {
                if(y%400 == 0) {
                    System.out.print(true);
                    return;
                }
                System.out.print(false);
                return;
            }
            System.out.print(true);                
        } else {
            System.out.print(false);
        }
    }
}