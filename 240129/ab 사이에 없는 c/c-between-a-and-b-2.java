import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String result = "YES";
        while(a<=b) {
            if(a%c == 0) {
                result = "NO";
                break;
            }
            a++;
        }
        System.out.print(result);
    }
}