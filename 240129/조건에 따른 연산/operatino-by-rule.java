import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; ; i++) {
            if(n >= 1000) {
                System.out.print(i);
                break;
            }
            if(n%2 == 0) {
                n = n*3+1;
            } else {
                n = n*2+2;
            }
        }
    }
}