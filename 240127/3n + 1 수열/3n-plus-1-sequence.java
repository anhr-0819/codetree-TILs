import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int cnt = 0;
        for(int i = 1; ;i++) {
            if(n%2 == 0) {
                n = n/2;
            } else {
                n = n*3+1;
            }

            if(n == 1) {
                System.out.print(i);
                break;
            }
        } 
    }
}