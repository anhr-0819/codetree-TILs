import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        
        for(int i = 1; ; i++) {
            n = n/i;
            if(n <= 1) {
                System.out.print(i);
                break;
            }
        }
    }
}