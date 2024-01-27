import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; ;i++) {
            int a = scan.nextInt();
            if(a<20 || a>=30) {
                System.out.printf("%.2f",(double)sum/(i-1));
                break;
            }
            sum += a;
        }
    }
}