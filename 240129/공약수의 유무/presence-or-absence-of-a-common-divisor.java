import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        while(a<=b) {
            if(1920%a == 0 && 2880%a == 0) {
                result = 1;
                break;
            }
            a++;
        }
        System.out.print(result);
    }
}