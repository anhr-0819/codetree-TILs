import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = n*2-1;
        for(int i = 0; i<n; i++) {
            for(int k = i*2; k>0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j<cnt; j++) {
                System.out.print("* ");
            }
            cnt-=2;
            System.out.println("");
        }
        cnt = 3;
        for(int i = n-1; i>0; i--) {
            for(int k = i*2-2; k>0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j<cnt; j++) {
                System.out.print("* ");
            }
            cnt+=2;
            System.out.println("");
        }
    }
}