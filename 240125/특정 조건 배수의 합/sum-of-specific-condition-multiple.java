import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int sum = 0;
        while(min<=max) {
            if(a%5 == 0) {
                sum+=a;
            }
            a++;
        }
        System.out.print(sum);
    }
}